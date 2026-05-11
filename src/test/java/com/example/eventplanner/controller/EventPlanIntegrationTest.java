package com.example.eventplanner.controller;

import com.example.eventplanner.model.EventPlan;
import com.example.eventplanner.repository.EventPlanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EventPlanIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EventPlanRepository repository;

    @BeforeEach
    void setup() {
        repository.deleteAll();
    }

    @Test
    void shouldReturnBadRequest_WhenBudgetIsNegative() throws Exception {
        String invalidPlanJson = "{\"title\":\"Party\", \"description\":\"Invalid Budget\", \"budget\":-500}";

        mockMvc.perform(post("/api/plans")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(invalidPlanJson))
                .andExpect(status().isBadRequest());
    }

    @Test
    void shouldCreatePlan_WhenDataIsValid() throws Exception {
        String validPlanJson = "{\"title\":\"Konferenz\", \"description\":\"Valid Plan\", \"budget\":2000}";

        mockMvc.perform(post("/api/plans")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(validPlanJson))
                .andExpect(status().isOk());
    }
}