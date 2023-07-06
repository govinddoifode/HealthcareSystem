package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Patient;
import com.app.repository.PatientRepository;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepo;

	@Override
	public List<Patient> getAll(){
		return patientRepo.findAll();
	}


	@Override
	public Patient addPatient(Patient patient) {
		Optional<Patient> existingPatient = patientRepo.findById(patient.getPatientId());
		if (existingPatient.isPresent()) {
			throw new IllegalArgumentException("Patient with ID " + patient.getPatientId() + " already exists");
		}

		return patientRepo.save(patient);
	}


	@Override
	public Optional<Patient> getPatientById(long patientId) {

		return patientRepo.findById(patientId);
	}


//	@Override
//	public Patient updatePatient(Patient patient, long patientId) {
//		Optional<Patient> p = patientRepo.findById(patientId);
//		patientRepo.save(patient);
//		return patient;
//	}



	@Override
	public Optional<Patient> deletePatient(long patientId) {
		Optional<Patient> p = patientRepo.findById(patientId);
		if(p.isPresent()) {
			Patient patient = p.get();
			patientRepo.delete(patient);
		}else {
			throw new IllegalArgumentException("No patient found for patientId: " + patientId);
		}
		return p;
	}


}
