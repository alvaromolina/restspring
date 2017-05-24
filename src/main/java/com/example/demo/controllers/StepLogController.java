package com.example.demo.controllers;

import com.example.demo.entities.StepLog;
import com.example.demo.services.StepLogService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Iterator;

/**
 * Created by amolina on 15/05/17.
 */

@RestController
public class StepLogController {

    private StepLogService stepLogService;


    @Autowired
    public void setStepLogService(StepLogService stepLogService) {
        this.stepLogService = stepLogService;
    }

    @RequestMapping(value = "/stepLog", method = RequestMethod.POST)
    public StepLog saveStepLog(@Valid StepLog stepLog, BindingResult bindingResult, Model model) {
        stepLogService.saveStepLog(stepLog);
        return stepLog;
    }

    @RequestMapping(value = "/stepLogs", method = RequestMethod.GET)
    public ResponseEntity<Iterable<StepLog>> getLogs() {
        return new ResponseEntity(stepLogService.listAllStepLogs(), HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/getSteps", method = RequestMethod.GET)
    public StepLog getSteps() {
        Integer steps = 0;

        Iterator<StepLog> iterator = stepLogService.listAllStepLogs().iterator();
        while(iterator.hasNext()){
            steps += iterator.next().getSteps();
        };
        StepLog steplog = new StepLog();
        steplog.setSteps(steps);
        steplog.setId(67626L);
        return steplog;
    }



}
