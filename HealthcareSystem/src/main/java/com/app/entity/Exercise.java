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

@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;
    
<<<<<<< HEAD
    @JsonBackReference
=======
>>>>>>> origin/master
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

<<<<<<< HEAD
	public Exercise(String name, String description, Patient patient) {
		super();
		this.name = name;
		this.description = description;
		this.patient = patient;
	}

=======
>>>>>>> origin/master
}
