package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.HealthRecord;
import com.app.entity.Patient;

public interface HealthRecordService {
	
	Optional<HealthRecord> getRecordById(long PatientId);
	
	List<HealthRecord> getAll();
	
	HealthRecord addRecord(HealthRecord record);

	void deleteRecord(long patientId, long id);

}
