package com.finalproject.EvaluationManagementSystem.repository;

import com.finalproject.EvaluationManagementSystem.entity.TrainerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<TrainerEntity, Long> {
}
