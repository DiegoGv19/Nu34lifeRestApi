package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.State;
import com.nu34life.repository.StateRepository;
import com.nu34life.service.StateService;


@Service
public class StateServiceImpl implements StateService{
	
	private StateRepository stateRepository;
	
	@Autowired
	public StateServiceImpl(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Override
	public List<State> listAll() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();
	}

	@Override
	public Optional<State> getById(Long id) {
		// TODO Auto-generated method stub
		return stateRepository.findById(id);
	}

	@Override
	public State create(State object) {
		// TODO Auto-generated method stub
		return stateRepository.save(object);
	}

	@Override
	public State update(State object) {
		// TODO Auto-generated method stub
		return stateRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		stateRepository.deleteById(id);
		
	}
}
