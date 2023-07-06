package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Exercise;
import com.app.repository.ExerciseRepository;
import com.app.service.ExerciseService;

@RestController
public class ExerciseController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@GetMapping("/exercises")
	public List<Exercise> getAll(){
		return exerciseService.getAllExercise();
	}
	
	@GetMapping("/exercises/{patientId}")
	public Optional<Exercise> getExerciseById(@PathVariable("patientId") long patientId){
		return exerciseService.getExercisePlan(patientId);
				
	}
	
	@PostMapping("/addexercise")
	public Exercise addExercise(@RequestBody Exercise exe) {
		Exercise exercise = new Exercise(exe.getName(),exe.getDescription(),exe.getPatient());
		exerciseService.addExercise(exercise);
		return exercise;			
	}

	@DeleteMapping("/removeexercises/{patientId}")
	public Optional<Exercise> deleteExercise(@RequestParam("patientId") long patientId) {
			return exerciseService.removeExercise(patientId);
		}
	}

