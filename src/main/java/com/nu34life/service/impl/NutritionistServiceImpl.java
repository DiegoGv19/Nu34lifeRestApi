package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nu34life.model.Nutritionist;
import com.nu34life.repository.NutritionistRepository;
import com.nu34life.service.NutritionistService;

@Service
public class NutritionistServiceImpl implements NutritionistService{

	private NutritionistRepository nutritionistRepository;
	
	@Autowired
	public NutritionistServiceImpl(NutritionistRepository nutritionistRepository) {
		this.nutritionistRepository = nutritionistRepository;
	}
	
	@Override
	public List<Nutritionist> listAll() {
		return nutritionistRepository.findAll();
	}

	@Override
	public Optional<Nutritionist> getById(Long id) {
		return nutritionistRepository.findById(id);
	}

	@Override
	public Nutritionist create(Nutritionist object) {
		return nutritionistRepository.save(object);
	}

	@Override
	public Nutritionist update(Nutritionist object) {
		return nutritionistRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		nutritionistRepository.deleteById(id);
	}
	
	@Override
	public List<Nutritionist>byEmail(String email){
		return nutritionistRepository.findByEmail(email);
	}


}
