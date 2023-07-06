package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Exercise;

public interface ExerciseService {

	 List<Exercise> getAllExercise();

	Optional<Exercise> getExercisePlan(long id);
	
	
	Exercise addExercise(Exercise exe);
	
	Optional<Exercise> removeExercise(long patientId);
}
