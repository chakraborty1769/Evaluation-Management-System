package com.finalproject.EvaluationManagementSystem.service;

import com.finalproject.EvaluationManagementSystem.model.BatchModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BatchService {
    ResponseEntity<Object> create(BatchModel batchModel);

    ResponseEntity<Object> update(BatchModel batchModel);

    ResponseEntity<Object> delete(BatchModel batchModel);

    ResponseEntity<List<BatchModel>> batchList();

    ResponseEntity<Object> getBatchByID(Long batchID);
}
