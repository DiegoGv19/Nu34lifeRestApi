package com.nu34life.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nu34life.model.PlanRecipe;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRecipeRepository extends JpaRepository<PlanRecipe, Long>{

}
