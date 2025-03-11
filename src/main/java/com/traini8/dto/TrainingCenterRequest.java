package com.traini8.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

import com.traini8.model.Address;

@Data
public class TrainingCenterRequest {

    @NotBlank(message = "Center name is mandatory")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is mandatory")
    @Size(min = 12, max = 12, message = "Center code must be exactly 12 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Center code must be alphanumeric")
    private String centerCode;

    @NotNull(message = "Address is mandatory")
    private Address address;

    private Integer studentCapacity;

    private List<String> coursesOffered;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @NotBlank(message = "Contact phone is mandatory")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    private String contactPhone;
}