package org.example.bewerbungstracker.dto;

import org.example.bewerbungstracker.model.ApplicationStatus;

import java.time.Instant;
import java.time.LocalDate;

public record ApplicationResponse(
        Long id, String company, String position, String jobUrl,
        ApplicationStatus status, LocalDate appliedAt, String notes,
        Instant createdAt, Instant updatedAt) {
}
