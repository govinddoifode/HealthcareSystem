package com.app.service;

import java.util.Optional;

import com.app.entity.Address;


public interface AddressService {
	
	

	 Address save(Address obj);
	
	
	 Optional<Address> getAll(long patientId);


	Address updateAddress(Address address, long patientId);


	void deleteAddress(long patientId);
	
}
