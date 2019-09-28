package com.nu34life.service.impl;

import com.nu34life.model.PlanRecipe;
import com.nu34life.repository.PlanRecipeRepository;
import com.nu34life.service.PlanRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanRecipeServiceImpl implements PlanRecipeService {

    private PlanRecipeRepository planRecipeRepository;

    @Autowired
    public PlanRecipeServiceImpl(PlanRecipeRepository planRecipeRepository){this.planRecipeRepository = planRecipeRepository;}

    @Override
    public List<PlanRecipe> listAll() {
        return planRecipeRepository.findAll();
    }

    @Override
    public Optional<PlanRecipe> getById(Long id) {
        return planRecipeRepository.findById(id);
    }

    @Override
    public PlanRecipe create(PlanRecipe object) {
        return planRecipeRepository.save(object);
    }

    @Override
    public PlanRecipe update(PlanRecipe object) {
        return planRecipeRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        planRecipeRepository.deleteById(id);
    }
}
