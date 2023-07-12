package com.finalproject.EvaluationManagementSystem.service.implementation;

import com.finalproject.EvaluationManagementSystem.entity.BatchEntity;
import com.finalproject.EvaluationManagementSystem.model.BatchModel;
import com.finalproject.EvaluationManagementSystem.repository.BatchRepository;
import com.finalproject.EvaluationManagementSystem.service.BatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BatchServiceImplementation implements BatchService {
    private final BatchRepository batchRepository;
    @Override
    public ResponseEntity<Object> create(BatchModel batchModel) {
        BatchEntity batchEntity = BatchEntity.builder()
                .batchName(batchModel.getBatchName())
                .build();
        BatchEntity savedBatchEntity = batchRepository.save(batchEntity);
        return new ResponseEntity<>(savedBatchEntity, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Object> update(BatchModel batchModel) {
        return null;
    }

    @Override
    public ResponseEntity<Object> delete(BatchModel batchModel) {
        return null;
    }

    @Override
    public ResponseEntity<List<BatchModel>> batchList() {
        return null;
    }

    @Override
    public ResponseEntity<Object> getBatchByID(Long batchID) {
        return null;
    }
}
