package com.example.eventplanner.controller;

import com.example.eventplanner.model.EventPlan;
import com.example.eventplanner.service.EventPlanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plans")
public class EventPlanController {

    @Autowired
    private EventPlanService service;

    @GetMapping
    public List<EventPlan> getAll() {
        return service.getAllPlans();
    }

    @PostMapping
    public ResponseEntity<EventPlan> create(@Valid @RequestBody EventPlan plan) {
        return ResponseEntity.ok(service.createPlan(plan));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deletePlan(id);
        return ResponseEntity.noContent().build();
    }
}
