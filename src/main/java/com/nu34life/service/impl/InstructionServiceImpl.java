package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.Instruction;
import com.nu34life.repository.InstructionRepository;
import com.nu34life.service.InstructionService;


@Service
public class InstructionServiceImpl implements InstructionService{

	private InstructionRepository instructionRepository;
	
	@Autowired
	public InstructionServiceImpl(InstructionRepository instructionRepository) {
		this.instructionRepository =instructionRepository;
		
	}

	@Override
	public List<Instruction> listAll() {
		// TODO Auto-generated method stub
		return instructionRepository.findAll();
	}

	@Override
	public Optional<Instruction> getById(Long id) {
		// TODO Auto-generated method stub
		return instructionRepository.findById(id);
	}

	@Override
	public Instruction create(Instruction object) {
		// TODO Auto-generated method stub
		return instructionRepository.save(object);
	}

	@Override
	public Instruction update(Instruction object) {
		// TODO Auto-generated method stub
		return instructionRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		instructionRepository.deleteById(id);
	}
}
