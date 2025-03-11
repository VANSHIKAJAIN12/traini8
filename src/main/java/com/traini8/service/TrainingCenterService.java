package com.traini8.service;

import com.traini8.dto.TrainingCenterRequest;
import com.traini8.dto.TrainingCenterResponse;
import com.traini8.model.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public TrainingCenterResponse createTrainingCenter(TrainingCenterRequest request) {
        TrainingCenter center = new TrainingCenter();
        BeanUtils.copyProperties(request, center);
        center.setCreatedOn(System.currentTimeMillis()); // Server-generated timestamp

        TrainingCenter savedCenter = repository.save(center);

        TrainingCenterResponse response = new TrainingCenterResponse();
        BeanUtils.copyProperties(savedCenter, response);
        return response;
    }

    public List<TrainingCenterResponse> getAllTrainingCenters() {
        return repository.findAll()
                .stream()
                .map(center -> {
                    TrainingCenterResponse response = new TrainingCenterResponse();
                    BeanUtils.copyProperties(center, response);
                    return response;
                })
                .collect(Collectors.toList());
    }
}