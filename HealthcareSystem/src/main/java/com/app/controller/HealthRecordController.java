package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.HealthRecord;
import com.app.service.HealthRecordService;

@RestController
public class HealthRecordController {

	@Autowired
	private HealthRecordService healthRecordService;

	@GetMapping("/healthrecord/{patientId}")
	public Optional<HealthRecord> getRecordById(@PathVariable("patientId")long patientId){
		return healthRecordService.getRecordById(patientId);
	}

	@GetMapping("/allrecord")
	public List<HealthRecord> getAll(){
		return healthRecordService.getAll();
	}

	@PostMapping("/addrecord")
	public HealthRecord addRecord(@RequestBody HealthRecord health) {
		HealthRecord healthRecord = new HealthRecord(health.getDate(),health.getWeight(),health.getHeight());
		return healthRecordService.addRecord(healthRecord);


	}
	@DeleteMapping("/deleterecord/{patientId}/{id}")
	public String removeRecord(@PathVariable("patientId") long patientId,@PathVariable("id") long id) {
		  healthRecordService.deleteRecord(patientId,id);
		  return "Health Record deleted";
	}
}
