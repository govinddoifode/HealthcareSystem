package com.app.service;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> origin/master

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.DietPlan;
import com.app.repository.DietPlanRepository;

<<<<<<< HEAD

public interface DietPlanService {

	
	Optional<DietPlan> getDietPlan(Long id);
	
	
	 DietPlan addDiet(DietPlan diet);
=======
@Service
public class DietPlanService {

	@Autowired
	private DietPlanRepository dietPlanRepository;
	
	public List<DietPlan> getDietPlan(Integer id) {
		return dietPlanRepository.findAll();
	}
	
>>>>>>> origin/master
}
