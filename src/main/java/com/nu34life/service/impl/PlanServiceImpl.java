package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.Plan;
import com.nu34life.repository.PlanRepository;
import com.nu34life.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{
	
	private PlanRepository planRepository;
	
	@Autowired
	public PlanServiceImpl(PlanRepository planRepository) {
		this.planRepository = planRepository;
	}

	@Override
	public List<Plan> listAll() {
		// TODO Auto-generated method stub
		return planRepository.findAll();
	}

	@Override
	public Optional<Plan> getById(Long id) {
		// TODO Auto-generated method stub
		return planRepository.findById(id);
	}

	@Override
	public Plan create(Plan object) {
		// TODO Auto-generated method stub
		return planRepository.save(object);
	}

	@Override
	public Plan update(Plan object) {
		// TODO Auto-generated method stub
		return planRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		planRepository.deleteById(id);
	}
	
}
