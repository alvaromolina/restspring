package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by amolina on 15/05/17.
 */
@Entity
public class StepLog {

    private Long id;

    private Integer steps;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSteps() {
        return steps;
    }


    public void setSteps(Integer steps) {
        this.steps = steps;
    }
}
