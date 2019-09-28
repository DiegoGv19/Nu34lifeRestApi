package com.nu34life.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nu34life.model.Ingredient;
import com.nu34life.service.IngredientService;

@RestController
@RequestMapping("/api/ingredient")
public class IngredientController {
	private IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService){
        this.ingredientService = ingredientService;
    }
    
    @GetMapping
    List<Ingredient> all(){
        return ingredientService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Ingredient> byId(@PathVariable Long id){
        return ingredientService.getById(id);
    }

    @PostMapping
    Ingredient create(@RequestBody Ingredient obj){
        return ingredientService.create(obj);
    }

    @PutMapping
    Ingredient update(@RequestBody Ingredient obj){
        return ingredientService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	ingredientService.delete(id);
    }
}
