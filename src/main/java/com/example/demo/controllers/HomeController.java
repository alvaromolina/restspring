package com.example.demo.controllers;

import com.example.demo.entities.StepLog;
import com.example.demo.services.StepLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Iterator;

/**
 * Created by amolina on 24/05/17.
 */
@Controller
public class HomeController {

    private StepLogService stepLogService;
    @Autowired
    public void setStepLogService(StepLogService stepLogService) {
        this.stepLogService = stepLogService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        int steps = 0;

        Iterator<StepLog> iterator = stepLogService.listAllStepLogs().iterator();
        while(iterator.hasNext()){
            steps += iterator.next().getSteps();
        };
        model.addAttribute("countSteps",steps);
        return "index";
    }
}
