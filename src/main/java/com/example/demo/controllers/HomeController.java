package com.example.demo.controllers;

import com.example.demo.entities.Order;
import com.example.demo.entities.StepLog;
import com.example.demo.services.StepLogService;
import com.example.demo.services.OrderService;

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
    private OrderService orderService;

    @Autowired
    public void setStepLogService(StepLogService stepLogService) {
        this.stepLogService = stepLogService;
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        int steps = 0;

        Iterator<StepLog> iterator = stepLogService.listAllStepLogs().iterator();
        while(iterator.hasNext()){
            steps += iterator.next().getSteps();
        };
        System.out.println(steps);
        model.addAttribute("countSteps",steps);
        return "index";
    }

    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public String map(Model model) {
        Order order  = orderService.getOrderById(1L);
        model.addAttribute("order",order);
        return "map";
    }
}
