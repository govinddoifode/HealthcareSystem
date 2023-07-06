package com.app.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Address;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Long> {
	@Query("SELECT add FROM Address add WHERE add.patient.id = :patientId")
	Optional<Address> findById(long patientId);
	 
	
}
