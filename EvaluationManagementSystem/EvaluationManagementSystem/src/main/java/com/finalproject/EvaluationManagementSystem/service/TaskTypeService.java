package com.finalproject.EvaluationManagementSystem.service;

import com.finalproject.EvaluationManagementSystem.model.TaskTypeModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TaskTypeService {
    ResponseEntity<Object> create(TaskTypeModel taskTypeModel);

    ResponseEntity<Object> update(TaskTypeModel updatedTaskTypeModel, Long typeID);

    ResponseEntity<Object> delete(TaskTypeModel taskTypeModel);

    ResponseEntity<List<TaskTypeModel>> typeList();

    ResponseEntity<Object> getTaskTypeByID(Long typeID);
}
