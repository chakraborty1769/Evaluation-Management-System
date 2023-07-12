package com.finalproject.EvaluationManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainerResponseModel {
    private String fullName;
    private String image;
    private String email;
    private String contactNumber;
    private String designation;
    private Integer experience;
    private String expertise;
}
