package com.finalproject.EvaluationManagementSystem.service.implementation;

import com.finalproject.EvaluationManagementSystem.model.TaskTypeModel;
import com.finalproject.EvaluationManagementSystem.repository.TaskTypeRepository;
import com.finalproject.EvaluationManagementSystem.service.TaskTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskTypeServiceImplementation implements TaskTypeService {
    private final TaskTypeRepository taskTypeRepository;
    @Override
    public ResponseEntity<Object> create(TaskTypeModel taskTypeModel) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(TaskTypeModel taskTypeModel) {
        return null;
    }

    @Override
    public ResponseEntity<Object> delete(TaskTypeModel taskTypeModel) {
        return null;
    }

    @Override
    public ResponseEntity<List<TaskTypeModel>> typeList() {
        return null;
    }

    @Override
    public ResponseEntity<Object> getTaskTypeByID(Long typeID) {
        return null;
    }
}
