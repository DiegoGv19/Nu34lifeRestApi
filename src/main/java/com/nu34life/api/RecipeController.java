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

import com.nu34life.model.Recipe;
import com.nu34life.service.RecipeService;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {
	
	private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }
    
    @GetMapping
    List<Recipe> all(){
        return recipeService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Recipe> byId(@PathVariable Long id){
        return recipeService.getById(id);
    }

    @PostMapping
    Recipe create(@RequestBody Recipe obj){
        return recipeService.create(obj);
    }

    @PutMapping
    Recipe update(@RequestBody Recipe obj){
        return recipeService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	recipeService.delete(id);
    }
}
