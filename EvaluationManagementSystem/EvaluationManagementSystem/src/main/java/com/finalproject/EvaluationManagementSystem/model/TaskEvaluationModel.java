package com.finalproject.EvaluationManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskEvaluationModel {
    private Long taskID;
    private Long submissionID;
    private Long typeID;
    private Long traineeID;
    private Double requirementUnderstanding;
    private Double expectedOutput;
    private Double presentation;
    private Double liveCoding;
}
