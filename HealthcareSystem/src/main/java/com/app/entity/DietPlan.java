package com.app.entity;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "diet_plans")
public class DietPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "diet_plan_meals", joinColumns = @JoinColumn(name = "diet_plan_id"))
    @Column(name = "meal")
    private List<String> meals;

    @ElementCollection
    @CollectionTable(name = "diet_plan_restrictions", joinColumns = @JoinColumn(name = "diet_plan_id"))
    @Column(name = "restriction")
    private List<String> restrictions;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;    

  
 
}

