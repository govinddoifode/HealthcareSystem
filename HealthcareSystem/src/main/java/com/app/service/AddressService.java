package com.app.service;

<<<<<<< HEAD
import java.util.Optional;

import com.app.entity.Address;


public interface AddressService {
	
	

	 Address save(Address obj);
	
	
	 Optional<Address> getAll(long patientId);


	Address updateAddress(Address address, long patientId);


	void deleteAddress(long patientId);
	
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Address;
import com.app.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressrepo;

	public Address save(Address obj)
	{
		return addressrepo.save(obj);
	}
	
	public List<Address> getAll()
	{
		return addressrepo.findAll();
	}

>>>>>>> origin/master
}
