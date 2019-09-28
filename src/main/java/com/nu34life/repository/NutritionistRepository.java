package com.nu34life.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nu34life.model.Nutritionist;
import com.nu34life.model.Patient;

@Repository
public interface NutritionistRepository extends JpaRepository<Nutritionist, Long>{

	List<Nutritionist> findByEmail(String email);
	
}

