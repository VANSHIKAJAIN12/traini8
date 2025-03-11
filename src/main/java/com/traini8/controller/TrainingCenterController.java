package com.traini8.controller;

import com.traini8.dto.TrainingCenterRequest;
import com.traini8.dto.TrainingCenterResponse;
import com.traini8.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TrainingCenterResponse> createTrainingCenter(
            @Valid @RequestBody TrainingCenterRequest request) {
        TrainingCenterResponse response = service.createTrainingCenter(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenterResponse>> getAllTrainingCenters() {
        List<TrainingCenterResponse> centers = service.getAllTrainingCenters();
        return ResponseEntity.ok(centers);
    }
}