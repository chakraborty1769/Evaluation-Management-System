package com.finalproject.EvaluationManagementSystem.controller;

import com.finalproject.EvaluationManagementSystem.model.AssignBatchModel;
import com.finalproject.EvaluationManagementSystem.model.BatchModel;
import com.finalproject.EvaluationManagementSystem.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ems/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    @PutMapping("/assign/{traineeID}")
    public ResponseEntity<Object> assign (@PathVariable ("traineeID")Long traineeID, @RequestBody BatchModel batchModel){
        return adminService.assign(traineeID,batchModel);
    }
    @PutMapping("/assign")
    public ResponseEntity<Object> assignTrainee (@RequestBody AssignBatchModel assignBatchModel){
        return adminService.assignTrainee(assignBatchModel);
    }
}
