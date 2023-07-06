package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.DietPlan;
import com.app.service.DietPlanService;

@RestController
public class DietPlanController {
	
	@Autowired
	private DietPlanService dietplanService;
	
	@GetMapping("/alldiet")
	public Optional<DietPlan> getDietPlanById(Long patientId){
		return dietplanService.getDietPlan(patientId);
		
	}
	
	@PostMapping("/adddiet")
	public DietPlan addDiet(@RequestBody DietPlan diet) {
		return dietplanService.addDiet(diet);
	}
	
}
