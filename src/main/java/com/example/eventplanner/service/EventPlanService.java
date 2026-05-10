package com.example.eventplanner.service;

import com.example.eventplanner.model.EventPlan;
import com.example.eventplanner.repository.EventPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventPlanService {

    @Autowired
    private EventPlanRepository repository;

    public EventPlan createPlan(EventPlan plan) {
        return repository.save(plan);
    }

    public List<EventPlan> getAllPlans() {
        return repository.findAll();
    }

    public Optional<EventPlan> getPlanById(Long id) {
        return repository.findById(id);
    }

    public void deletePlan(Long id) {
        repository.deleteById(id);
    }
}