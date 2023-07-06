package com.app.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Address;
import com.app.entity.Exercise;

@Repository
@Transactional
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{
	@Query("SELECT e FROM Exercise e WHERE e.patient.id = :patientId")
	Optional<Exercise> findById(long patientId);
	 

}
