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

import com.nu34life.model.Plan;
import com.nu34life.service.PlanService;

@RestController
@RequestMapping("/api/plan")
public class PlanController {

	private PlanService planService;

    @Autowired
    public PlanController(PlanService planService){
        this.planService = planService;
    }
    
    @GetMapping
    List<Plan> all(){
        return planService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Plan> byId(@PathVariable Long id){
        return planService.getById(id);
    }

    @PostMapping
    Plan create(@RequestBody Plan obj){
        return planService.create(obj);
    }

    @PutMapping
    Plan update(@RequestBody Plan obj){
        return planService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	planService.delete(id);
    }
}
