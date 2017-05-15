package com.example.demo.services;

import com.example.demo.entities.StepLog;

/**
 * Created by amolina on 15/05/17.
 */
public interface StepLogService {


        Iterable<StepLog> listAllStepLogs();

        StepLog getStepLogById(Integer id);

        StepLog saveStepLog(StepLog steplog);

        void deleteStepLog(Integer id);


}
