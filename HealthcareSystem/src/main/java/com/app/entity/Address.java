package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonBackReference;

=======
>>>>>>> origin/master
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
<<<<<<< HEAD
=======
@AllArgsConstructor
>>>>>>> origin/master
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private long addressId; 
=======
	private Integer addressId; 
>>>>>>> origin/master

	@Column(length=50,nullable = false)
	private String streetAddress;
	@Column(length=50,nullable = false)
	private String city;
	@Column(length=50,nullable = false)
	private String country;
	@Column(length=50,nullable = false)
<<<<<<< HEAD
	private long zipcode;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	public Address(String streetAddress, String city, String country, long zipcode) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;

	}
=======
	private int zipcode;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
>>>>>>> origin/master
}
