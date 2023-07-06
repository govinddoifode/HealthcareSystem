package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RegisterPatientdto;
import com.app.entity.Address;
import com.app.entity.Patient;
import com.app.service.AddressService;
import com.app.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getpatients")
	public List<Patient> getAllPatient(){
		return patientService.getAll();
	}

	@PostMapping("/register")
	public Patient registerPatient(@RequestBody RegisterPatientdto p) {
		Address newAddress = new Address(p.getStreetAddress(),p.getCity(), p.getCountry(), p.getZipcode());
		addressService.save(newAddress);
		Patient newPatient = new Patient(p.getFirstName(), p.getLastName(),p.getDateOfBirth(),p.getGender(),p.getPhoneNumber(),p.getEmail(),newAddress);
		 Patient savedPatient = patientService.addPatient(newPatient);
		 newAddress.setPatient(savedPatient);
		 addressService.save(newAddress);
		  return savedPatient;
	}
	
	@GetMapping("/getpatients/{patientId}")
	public Optional<Patient> getById(@PathVariable ("patientId") long patientId){
		return patientService.getPatientById(patientId);
	}
	
	@DeleteMapping("/removepatient/{patientId}")
	public Optional<Patient> removePatient(@PathVariable ("patientId") long patientId) {
		return patientService.deletePatient(patientId);
	}
}
