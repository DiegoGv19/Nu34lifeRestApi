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

import com.nu34life.model.Drug;
import com.nu34life.service.DrugService;

@RestController
@RequestMapping("/api/drug")
public class DrugController {
	private DrugService drugService;

    @Autowired
    public DrugController(DrugService drugService){
        this.drugService = drugService;
    }
    
    @GetMapping
    List<Drug> all(){
        return drugService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Drug> byId(@PathVariable Long id){
        return drugService.getById(id);
    }

    @PostMapping
    Drug create(@RequestBody Drug obj){
        return drugService.create(obj);
    }

    @PutMapping
    Drug update(@RequestBody Drug obj){
        return drugService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	drugService.delete(id);
    }
}
