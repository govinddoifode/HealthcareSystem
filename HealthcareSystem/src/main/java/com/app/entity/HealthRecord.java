package com.app.entity;

import java.time.LocalDate;

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
@Table(name = "health_records")
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private long id;
=======
    private Long id;
>>>>>>> origin/master

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private double height;
    
<<<<<<< HEAD
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

	public HealthRecord(LocalDate date, double weight, double height) {
		super();
		this.date = date;
		this.weight = weight;
		this.height = height;
	}
    
=======
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
>>>>>>> origin/master
    
}
