package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.DietPlan;
import com.app.repository.DietPlanRepository;

@Service
@Transactional
public class DietPlanServiceImpl implements DietPlanService {

	@Autowired
	private DietPlanRepository dietPlanRepository;
	
	@Override
	public Optional<DietPlan> getDietPlan(Long id) {
		return dietPlanRepository.findById(id);
	}
	
	@Override
	public DietPlan addDiet(DietPlan diet) {
		return dietPlanRepository.save(diet);
	}
}
