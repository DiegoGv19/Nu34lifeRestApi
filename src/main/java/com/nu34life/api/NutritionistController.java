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

import com.nu34life.model.Nutritionist;
import com.nu34life.service.NutritionistService;

@RestController
@RequestMapping("/api/nutritionist")
public class NutritionistController {
	private NutritionistService nutritionistService;

    @Autowired
    public NutritionistController(NutritionistService nutritionistService){
        this.nutritionistService = nutritionistService;
    }
    
    @GetMapping(path = "/all")
    List<Nutritionist> all(){
        return nutritionistService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Nutritionist> byId(@PathVariable Long id){
        return nutritionistService.getById(id);
    }

    @PostMapping
    Nutritionist create(@RequestBody Nutritionist obj){
        return nutritionistService.create(obj);
    }

    @PutMapping
    Nutritionist update(@RequestBody Nutritionist obj){
        return nutritionistService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	nutritionistService.delete(id);
    }
    
    @RequestMapping(path = "/email/{email}")
    public List<Nutritionist>byEmail(@PathVariable(value = "email") String email) {
    	return nutritionistService.byEmail(email);
    }
    
}
