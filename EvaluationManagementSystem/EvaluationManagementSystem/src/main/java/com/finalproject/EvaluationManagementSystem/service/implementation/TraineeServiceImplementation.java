package com.finalproject.EvaluationManagementSystem.service.implementation;

import com.finalproject.EvaluationManagementSystem.entity.TraineeEntity;
import com.finalproject.EvaluationManagementSystem.model.TraineeRequestModel;
import com.finalproject.EvaluationManagementSystem.service.TraineeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImplementation implements TraineeService {
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
        return null;
    }

    @Override
    public ResponseEntity<Object> delete(TraineeRequestModel traineeRequestModel) {
        return null;
    }
}
