package com.example.eventplanner.repository;

import com.example.eventplanner.model.EventPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPlanRepository extends JpaRepository<EventPlan, Long> {

}