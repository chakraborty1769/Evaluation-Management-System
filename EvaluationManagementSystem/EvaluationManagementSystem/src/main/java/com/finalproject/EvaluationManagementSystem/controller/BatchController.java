package com.finalproject.EvaluationManagementSystem.controller;

import com.finalproject.EvaluationManagementSystem.model.BatchModel;
import com.finalproject.EvaluationManagementSystem.service.BatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ems/batch")
@RequiredArgsConstructor
public class BatchController {
    private final BatchService batchService;
    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody BatchModel batchModel){
        return batchService.create(batchModel);
    }
    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody BatchModel batchModel){
        return batchService.update(batchModel);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody BatchModel batchModel){
        return batchService.delete(batchModel);
    }
    @GetMapping("/all")
    public ResponseEntity<List<BatchModel>> getAll(){
        return batchService.batchList();
    }
    @GetMapping("/{batchID}")
    public ResponseEntity<Object> getTaskType(@PathVariable("batchID") Long batchID){
        return batchService.getBatchByID(batchID);
    }
}
