package com.example.demo.controllers;

import com.example.demo.entities.StepLog;
import com.example.demo.services.StepLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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

}
