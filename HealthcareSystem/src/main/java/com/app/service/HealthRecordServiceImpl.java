package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.HealthRecord;
import com.app.entity.Patient;
import com.app.repository.HealthRecordRepository;

@Service
@Transactional
public class HealthRecordServiceImpl implements HealthRecordService {

	@Autowired
	private HealthRecordRepository healthRecordRepository;

	@Override
	public Optional<HealthRecord> getRecordById(long patientId) {
		
		return healthRecordRepository.findById(patientId) ;
	}

	@Override
	public List<HealthRecord> getAll() {
		return healthRecordRepository.findAll();
	}

	@Override
	public HealthRecord addRecord(HealthRecord record) {
		return healthRecordRepository.save(record) ;
	}

	@Override
	public void deleteRecord(long patientId, long id) {
		
		 healthRecordRepository.deleteByPatientIdAndId(patientId,id);;
	}
	
	
	
}
