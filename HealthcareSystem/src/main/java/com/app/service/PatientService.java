package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Address;
import com.app.entity.Patient;

public interface PatientService {

	List<Patient> getAll();
	
	Patient addPatient(Patient patient);
	
	Optional<Patient> getPatientById(long patientId);
	

//	Patient updatePatient(Patient patient, long patientId);


	Optional<Patient> deletePatient(long patientId);
}
