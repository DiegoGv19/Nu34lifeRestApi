package com.nu34life.service.impl;

import com.nu34life.model.RecipeDetail;
import com.nu34life.repository.RecipeDetailRepository;
import com.nu34life.service.RecipeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeDetailServiceImpl implements RecipeDetailService {

    private RecipeDetailRepository recipeDetailRepository;

    @Autowired
    public RecipeDetailServiceImpl(RecipeDetailRepository recipeDetailRepository){this.recipeDetailRepository = recipeDetailRepository;}

    @Override
    public List<RecipeDetail> listAll() {
        return recipeDetailRepository.findAll();
    }

    @Override
    public Optional<RecipeDetail> getById(Long id) {
        return recipeDetailRepository.findById(id);
    }

    @Override
    public RecipeDetail create(RecipeDetail object) {
        return recipeDetailRepository.save(object);
    }

    @Override
    public RecipeDetail update(RecipeDetail object) {
        return recipeDetailRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        recipeDetailRepository.deleteById(id);
    }
}
