package com.nu34life.api;

import com.nu34life.model.RecipeDetail;
import com.nu34life.service.RecipeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recipeDetail")
public class RecipeDetailController {

    private RecipeDetailService recipeDetailService;

    @Autowired
    public RecipeDetailController(RecipeDetailService recipeDetailService){this.recipeDetailService = recipeDetailService;}


    @GetMapping
    List<RecipeDetail> all(){
        return recipeDetailService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<RecipeDetail> byId(@PathVariable Long id){
        return recipeDetailService.getById(id);
    }

    @PostMapping
    RecipeDetail create(@RequestBody RecipeDetail obj){
        return recipeDetailService.create(obj);
    }

    @PutMapping
    RecipeDetail update(@RequestBody RecipeDetail obj){
        return recipeDetailService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
        recipeDetailService.delete(id);
    }

}
