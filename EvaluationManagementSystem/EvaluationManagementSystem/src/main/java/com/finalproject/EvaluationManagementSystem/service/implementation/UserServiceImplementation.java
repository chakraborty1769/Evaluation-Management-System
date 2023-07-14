package com.finalproject.EvaluationManagementSystem.service.implementation;

import com.finalproject.EvaluationManagementSystem.config.JwtService;
import com.finalproject.EvaluationManagementSystem.entity.UserEntity;
import com.finalproject.EvaluationManagementSystem.model.AuthenticationResponse;
import com.finalproject.EvaluationManagementSystem.model.UserRequestModel;
import com.finalproject.EvaluationManagementSystem.repository.UserRepository;
import com.finalproject.EvaluationManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    @Override
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
        AuthenticationResponse authenticationResponse = AuthenticationResponse.builder()
                .token(jwtService.generateToken(userEntity))
                .build();
        return new ResponseEntity<>(authenticationResponse, HttpStatus.CREATED);
    }
}
