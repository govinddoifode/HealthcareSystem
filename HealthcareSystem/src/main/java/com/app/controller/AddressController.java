package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Address;
import com.app.service.AddressService;

@RestController
@RequestMapping("/")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/register")
	public Address registerAddress(@RequestBody Address addr) {
		Address address=new Address(addr.getAddressId(),addr.getStreetAddress(),addr.getCity(),addr.getCountry(),addr.getZipcode(),addr.getPatient());
		addressService.save(address);
		
		return address;
		
	}
	
	@GetMapping("/address")
	public List<Address> getAll() {
		return  addressService.getAll();
	}

}
