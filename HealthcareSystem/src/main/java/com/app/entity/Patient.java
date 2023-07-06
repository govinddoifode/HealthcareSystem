package com.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String gender;
    
    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

//    @Column(nullable = false)
//    private String imagePath;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<DietPlan> dietPlans;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Exercise> exercises;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<HealthRecord> healthRecords;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<MedicalInformation> medicalInformationList;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<MedicalTreatment> medicalTreatments;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Medication> medications;

	public Patient(String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber,
			String email, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}


}
