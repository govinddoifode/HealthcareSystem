package com.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.DietPlan;

@Transactional
@Repository
public interface DietPlanRepository extends JpaRepository<DietPlan, Integer> {

}
