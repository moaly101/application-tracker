package org.example.bewerbungstracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.example.bewerbungstracker.model.ApplicationStatus;

import java.time.LocalDate;

public record ApplicationRequest(
        @NotBlank String company,
        @NotBlank String position,
        String jobUrl,
        @NotNull ApplicationStatus status,
        LocalDate appliedAt,
        String notes) {}
