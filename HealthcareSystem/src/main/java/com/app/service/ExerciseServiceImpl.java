package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.app.entity.Exercise;
import com.app.repository.ExerciseRepository;

@Service
@Transactional
public class ExerciseServiceImpl implements ExerciseService {

	private ExerciseRepository exerciseRepository;
	
	@Override
	public List<Exercise> getAllExercise(){
		return exerciseRepository.findAll();
	}

	@Override
	public Optional<Exercise> getExercisePlan(long id) {
		return exerciseRepository.findById(id);
	} 

	@Override
	public Exercise addExercise(Exercise exe) {

		return exerciseRepository.save(exe);
	}
	@Override
	public Optional<Exercise> removeExercise(long patientId) {
		Optional<Exercise> exercise = exerciseRepository.findById(patientId);
		if(exercise.isPresent()) {
			Exercise ex = exercise.get();
			exerciseRepository.delete(ex);
		} else {
			throw new IllegalArgumentException("No exercise found for patientId: " + patientId);
		}
		return exercise;
	}
}