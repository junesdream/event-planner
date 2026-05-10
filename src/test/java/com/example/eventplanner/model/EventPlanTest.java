package com.example.eventplanner.model;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EventPlanTest {

    private Validator validator;

    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void shouldFailWhenTitleIsEmpty() {
        EventPlan plan = new EventPlan();
        plan.setTitle("");
        plan.setBudget(100);

        assertFalse(validator.validate(plan).isEmpty());
    }

    @Test
    void shouldFailWhenBudgetIsNegative() {
        EventPlan plan = new EventPlan();
        plan.setTitle("Sommerfest");
        plan.setBudget(-10);

        assertFalse(validator.validate(plan).isEmpty());
    }
}