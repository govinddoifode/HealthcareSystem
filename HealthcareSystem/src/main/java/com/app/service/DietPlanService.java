package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.DietPlan;
import com.app.repository.DietPlanRepository;

@Service
public class DietPlanService {

	@Autowired
	private DietPlanRepository dietPlanRepository;
	
	public List<DietPlan> getDietPlan(Integer id) {
		return dietPlanRepository.findAll();
	}
	
}
