package com.finalproject.EvaluationManagementSystem.service;

import com.finalproject.EvaluationManagementSystem.model.TraineeRequestModel;
import org.springframework.http.ResponseEntity;

public interface TraineeService {
    ResponseEntity<Object> create(TraineeRequestModel userDTO);

    ResponseEntity<Object> update(TraineeRequestModel updatedTraineeRequestModel);

    ResponseEntity<Object> getTrainee(Long traineeID);

    ResponseEntity<Object> delete(TraineeRequestModel traineeRequestModel);
}
