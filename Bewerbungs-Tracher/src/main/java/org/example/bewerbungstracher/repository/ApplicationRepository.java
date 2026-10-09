package org.example.bewerbungstracher.repository;

import org.example.bewerbungstracher.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicationRepository extends JpaRepository<JobApplication, Long> {
}
