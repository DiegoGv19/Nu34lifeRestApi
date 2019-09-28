package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.Recipe;
import com.nu34life.repository.RecipeRepository;
import com.nu34life.service.RecipeService;


@Service
public class RecipeServiceImpl implements RecipeService{
	private RecipeRepository recipeRepository;
	
	@Autowired
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository; 
	}

	@Override
	public List<Recipe> listAll() {
		// TODO Auto-generated method stub
		return recipeRepository.findAll();
	}

	@Override
	public Optional<Recipe> getById(Long id) {
		// TODO Auto-generated method stub
		return recipeRepository.findById(id);
	}

	@Override
	public Recipe create(Recipe object) {
		// TODO Auto-generated method stub
		return recipeRepository.save(object);
	}

	@Override
	public Recipe update(Recipe object) {
		// TODO Auto-generated method stub
		return recipeRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		recipeRepository.deleteById(id);
	}
}
