package com.finalproject.EvaluationManagementSystem.service.implementation;

import com.finalproject.EvaluationManagementSystem.entity.TrainerEntity;
import com.finalproject.EvaluationManagementSystem.model.TrainerRequestModel;
import com.finalproject.EvaluationManagementSystem.repository.TrainerRepository;
import com.finalproject.EvaluationManagementSystem.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TrainerServiceImplementation implements TrainerService {
    private final TrainerRepository trainerRepository;
    @Override
    public ResponseEntity<Object> create(TrainerRequestModel trainerRequestModel) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(TrainerRequestModel updatedTrainerRequestModel) {
        return null;
    }

    @Override
    public ResponseEntity<Object> getTrainee(Long trainerID) {
        Optional<TrainerEntity> trainerEntity = trainerRepository.findById(trainerID);
        if (trainerEntity.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            TrainerEntity trainer = trainerEntity.get();
            return new ResponseEntity<>(trainer, HttpStatus.FOUND);
        }
    }

    @Override
    public ResponseEntity<List<TrainerEntity>> getAll() {
        List<TrainerEntity> list = trainerRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Object> delete(TrainerRequestModel trainerRequestModel) {
        return null;
    }
}
