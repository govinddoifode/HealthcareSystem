package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Address;
import com.app.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/addaddress")
	public Address registerAddress(@RequestBody Address addr) {
		Address address=new Address(addr.getStreetAddress(),addr.getCity(),addr.getCountry(),addr.getZipcode());
		addressService.save(address);
		
		return address;
		
	}
	
	@GetMapping("/getaddress/{patientId}")
	public Optional<Address> getAddressByPatientId(@PathVariable("patientId") long patientId) {
	    return addressService.getAll(patientId);
	}

 

	@DeleteMapping("/deleteaddress/{patientId}")
	public ResponseEntity<HttpStatus> deleteAddress(@PathVariable long patientId) {
		 try {
			   this.addressService.deleteAddress(patientId);
			 return new ResponseEntity< >(HttpStatus.OK);
			 
		 }catch (Exception e) {
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
	}
	
	@PutMapping("/updateaddress/{patientId}")
	public Address updateAddress(@RequestBody Address address , @PathVariable("patientId") long patientId) {
		this.addressService.updateAddress(address,patientId);
		return address;
	}
}
