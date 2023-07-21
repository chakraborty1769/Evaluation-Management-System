package com.finalproject.EvaluationManagementSystem.service.implementation;

import com.finalproject.EvaluationManagementSystem.entity.TraineeEntity;
import com.finalproject.EvaluationManagementSystem.model.TraineeRequestModel;
import com.finalproject.EvaluationManagementSystem.repository.TraineeRepository;
import com.finalproject.EvaluationManagementSystem.service.TraineeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TraineeServiceImplementation implements TraineeService {
    private final TraineeRepository traineeRepository;
    @Override
    public ResponseEntity<Object> create(TraineeRequestModel traineeRequestModel) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(TraineeRequestModel updatedTraineeRequestModel) {
        return null;
    }

    @Override
    public ResponseEntity<Object> getTrainee(Long traineeID) {
        Optional<TraineeEntity> traineeEntity = traineeRepository.findById(traineeID);
        if (traineeEntity.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            TraineeEntity trainee = traineeEntity.get();
            return new ResponseEntity<>(trainee, HttpStatus.FOUND);
        }
    }

    @Override
    public ResponseEntity<Object> delete(TraineeRequestModel traineeRequestModel) {
        return null;
    }

    @Override
    public ResponseEntity<List<TraineeEntity>> getAll() {
        List<TraineeEntity> list = traineeRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.FOUND);
    }
}
