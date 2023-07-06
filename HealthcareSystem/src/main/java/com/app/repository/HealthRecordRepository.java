package com.app.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.HealthRecord;

@Repository
@Transactional
public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {



	@Query("SELECT h FROM HealthRecord h WHERE h.patient.id = :patientId")
	Optional<HealthRecord> findByPatientId(@Param("patientId") long patientId);

	@Modifying
	@Query("DELETE FROM HealthRecord h WHERE h.patient.id = :patientId AND h.id = :id")
    void deleteByPatientIdAndId(long patientId, long id);

}
