package com.app.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.Patient;

@Repository
@Transactional
public interface PatientRepository extends JpaRepository<Patient, Long> {

	@Query("SELECT p FROM Patient p WHERE p.patientId = :patientId")
	Optional<Patient> findById(@Param("patientId") long patientId);






}
