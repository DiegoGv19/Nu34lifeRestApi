package com.nu34life.api;

import com.nu34life.model.PlanRecipe;
import com.nu34life.service.PlanRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/planRecipe")
public class PlanRecipeController {

    private PlanRecipeService planRecipeService;

    @Autowired
    public PlanRecipeController(PlanRecipeService planRecipeService){this.planRecipeService = planRecipeService;}

    @GetMapping
    List<PlanRecipe> all(){
        return planRecipeService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<PlanRecipe> byId(@PathVariable Long id){
        return planRecipeService.getById(id);
    }

    @PostMapping
    PlanRecipe create(@RequestBody PlanRecipe obj){
        return planRecipeService.create(obj);
    }

    @PutMapping
    PlanRecipe update(@RequestBody PlanRecipe obj){
        return planRecipeService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
        planRecipeService.delete(id);
    }
}
