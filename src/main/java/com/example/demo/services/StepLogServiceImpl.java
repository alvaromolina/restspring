package com.example.demo.services;

import com.example.demo.entities.StepLog;
import com.example.demo.repositories.StepLogRepository;
import com.example.demo.services.StepLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by amolina on 15/05/17.
 */
@Service
public class StepLogServiceImpl implements StepLogService {
    private StepLogRepository stepLogRepository;

    @Autowired
    @Qualifier(value = "stepLogRepository")
    public void setStepLogRepository(StepLogRepository stepLogRepository) {
        this.stepLogRepository = stepLogRepository;
    }

    @Override
    public Iterable<StepLog> listAllStepLogs() {
        return stepLogRepository.findAll();
    }

    @Override
    public StepLog getStepLogById(Integer id) {
        return stepLogRepository.findOne(id);
    }

    @Override
    public StepLog saveStepLog(StepLog stepLog) {
        return stepLogRepository.save(stepLog);
    }

    @Override
    public void deleteStepLog(Integer id) {
        stepLogRepository.delete(id);
    }
}
