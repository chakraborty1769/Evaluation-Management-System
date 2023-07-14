package com.finalproject.EvaluationManagementSystem.service.implementation;

import com.finalproject.EvaluationManagementSystem.config.JwtService;
import com.finalproject.EvaluationManagementSystem.entity.UserEntity;
import com.finalproject.EvaluationManagementSystem.model.UserRequestModel;
import com.finalproject.EvaluationManagementSystem.model.UserResponseModel;
import com.finalproject.EvaluationManagementSystem.repository.UserRepository;
import com.finalproject.EvaluationManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final UserResponseModel userResponseModel;
    private final RestTemplate restTemplate;
    private final HttpHeaders headers;

    private static final String traineeEndPoint = "http://localhost:8081/ems/trainee";
    private static final String trainerEndPoint = "http://localhost:8081/ems/trainer";
    private static final String adminEndPoint = "http://localhost:8081/ems/admin";
    @Override
    @Transactional
    public ResponseEntity<Object> register(UserRequestModel userRequestModel) {
        UserEntity userEntity = UserEntity.builder()
                .fullName(userRequestModel.getFullName())
                .image(userRequestModel.getImage())
                .contactNumber(userRequestModel.getContactNumber())
                .presentAddress(userRequestModel.getPresentAddress())
                .email(userRequestModel.getEmail())
                .password(passwordEncoder.encode(userRequestModel.getPassword()))
                .role(userRequestModel.getRole())
                .build();
        userRepository.save(userEntity);

        userResponseModel.setFullName(userEntity.getFullName());
        userResponseModel.setEmail(userEntity.getEmail());
        userResponseModel.setContactNumber(userEntity.getContactNumber());
        userResponseModel.setPresentAddress(userEntity.getPresentAddress());
        userResponseModel.setImage(userEntity.getImage());
        userResponseModel.setRole(userEntity.getRole());

        Long userID = userEntity.getUserID();
        String role = userResponseModel.getRole().name();
        if(role.equalsIgnoreCase("TRAINEE")){
            String responseEntity = restTemplate.postForObject(traineeEndPoint+"?userID="+userID, null, String.class);
            if(responseEntity.equals("CREATED")){
                return new ResponseEntity<>(userResponseModel, HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } else if (role.equalsIgnoreCase("TRAINER")){
            String responseEntity = restTemplate.postForObject(trainerEndPoint+"?userID="+userID, null, String.class);
            if(responseEntity.equals("CREATED")){
                return new ResponseEntity<>(userResponseModel, HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }
        else {
            String responseEntity = restTemplate.postForObject(adminEndPoint+"?userID="+userID, null, String.class);
            if(responseEntity.equals("CREATED")){
                return new ResponseEntity<>(userResponseModel, HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }
    }
}
