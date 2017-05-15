package com.example.demo.repositories;

import com.example.demo.entities.StepLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by amolina on 15/05/17.
 */
public interface StepLogRepository  extends JpaRepository<StepLog, Integer> {
}
