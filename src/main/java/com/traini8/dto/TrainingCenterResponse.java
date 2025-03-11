package com.traini8.dto;

import lombok.Data;

import java.util.List;

import com.traini8.model.Address;

@Data
public class TrainingCenterResponse {
    private Long id;
    private String centerName;
    private String centerCode;
    private Address address;
    private Integer studentCapacity;
    private List<String> coursesOffered;
    private Long createdOn;
    private String contactEmail;
    private String contactPhone;
}