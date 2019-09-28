package com.nu34life.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nu34life.model.Ingredient;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>{

}
