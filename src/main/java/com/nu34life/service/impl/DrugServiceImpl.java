package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.Drug;
import com.nu34life.repository.DrugRepository;
import com.nu34life.service.DrugService;

@Service
public class DrugServiceImpl implements DrugService{
	
	private DrugRepository drugRepository;
	
	@Autowired
	public DrugServiceImpl(DrugRepository drugRepository) {
		this.drugRepository = drugRepository;
	}
	
	@Override
	public List<Drug> listAll() {

		return drugRepository.findAll();
	}

	@Override
	public Optional<Drug> getById(Long id) {

		return drugRepository.findById(id);
	}

	@Override
	public Drug create(Drug object) {

		return drugRepository.save(object);
	}

	@Override
	public Drug update(Drug object) {
		// TODO Auto-generated method stub
		return drugRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		drugRepository.deleteById(id);
	}
	

}
