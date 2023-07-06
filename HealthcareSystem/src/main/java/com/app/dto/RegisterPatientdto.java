package com.app.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RegisterPatientdto {
	
	private String firstName;

	private String lastName;

	private LocalDate dateOfBirth;

	private String gender;

	
	private String phoneNumber;

	
	private String email;

	private String streetAddress;
	
	private String city;
	
	private String country;
	
	private long zipcode;
	
}
