package com.nu34life.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nu34life.model.RecipeDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeDetailRepository extends JpaRepository<RecipeDetail, Long>{

}
