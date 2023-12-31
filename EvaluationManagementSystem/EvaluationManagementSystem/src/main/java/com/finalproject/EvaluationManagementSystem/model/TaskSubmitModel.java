package com.finalproject.EvaluationManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskSubmitModel {
    private Long taskID;
    private Long typeID;
    private Long traineeID;
    private Date submissionDate;
    private File submittedFile;
}
