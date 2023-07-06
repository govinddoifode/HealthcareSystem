package com.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Address;
import com.app.entity.Patient;
import com.app.repository.AddressRepository;
import com.app.repository.PatientRepository;
@Transactional
@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressrepo;
	
	@Autowired
	private PatientRepository patientRepo;
	
	@Override
	public Address save(Address obj)
	{
		return addressrepo.save(obj);
	}
	@Override
	public Optional<Address> getAll(long patientId)
	{
		return addressrepo.findById(patientId);
	}
	@Override
	public Address updateAddress(Address address, long patientId)   {
		Patient patient = patientRepo.getById(patientId);
	    address.setPatient(patient);
	    addressrepo.save(address);
	    return address;
	}


	@Override
	public void deleteAddress(long patientId) {
	    Optional<Address> addressOptional = addressrepo.findById(patientId);
	    if (addressOptional.isPresent()) {
	        Address address = addressOptional.get();
	        addressrepo.delete(address);
	    } else {
	        throw new IllegalArgumentException("No address found for patientId: " + patientId);
	    }
	}


	

}
