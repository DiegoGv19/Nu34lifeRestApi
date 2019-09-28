package com.nu34life.service;

import java.util.List;

import com.nu34life.model.Nutritionist;

public interface NutritionistService extends CrudService<Nutritionist>{
	
	List<Nutritionist>byEmail(String email);
}
