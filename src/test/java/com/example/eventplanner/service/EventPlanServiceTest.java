package com.example.eventplanner.service;


import com.example.eventplanner.model.EventPlan;
import com.example.eventplanner.repository.EventPlanRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class EventPlanServiceTest {

    @Mock
    private EventPlanRepository repository;

    @InjectMocks
    private EventPlanService service;

    @Test
    void shouldCallRepositoryWhenSaving() {
        EventPlan plan = new EventPlan();
        plan.setTitle("Party");

        service.createPlan(plan);

        verify(repository, times(1)).save(plan);
    }
}