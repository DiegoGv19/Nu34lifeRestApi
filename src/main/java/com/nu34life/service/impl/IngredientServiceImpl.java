package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.Ingredient;
import com.nu34life.repository.IngredientRepository;
import com.nu34life.service.IngredientService;


@Service
public class IngredientServiceImpl implements IngredientService{
	
	private IngredientRepository ingredientRepository;
	@Autowired
	public IngredientServiceImpl(IngredientRepository ingredientRepository) {
			this.ingredientRepository = ingredientRepository;
	}
	@Override
	public List<Ingredient> listAll() {
		// TODO Auto-generated method stub
		return ingredientRepository.findAll();
	}
	@Override
	public Optional<Ingredient> getById(Long id) {
		// TODO Auto-generated method stub
		return ingredientRepository.findById(id);
	}
	@Override
	public Ingredient create(Ingredient object) {
		// TODO Auto-generated method stub
		return ingredientRepository.save(object);
	}
	@Override
	public Ingredient update(Ingredient object) {
		// TODO Auto-generated method stub
		return ingredientRepository.save(object);
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ingredientRepository.deleteById(id);
	}
}
