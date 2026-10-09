package org.example.bewerbungstracker.repository;

import org.example.bewerbungstracker.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicationRepository extends JpaRepository<JobApplication, Long> {
}
