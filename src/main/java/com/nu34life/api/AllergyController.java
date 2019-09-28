package com.nu34life.api;

import com.nu34life.model.Allergy;
import com.nu34life.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/allergy")
public class AllergyController {

    private AllergyService allergyService;

    @Autowired
    public AllergyController(AllergyService allergyService){this.allergyService = allergyService;}

    @GetMapping
    List<Allergy> all(){
        return allergyService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Allergy> byId(@PathVariable Long id){
        return allergyService.getById(id);
    }

    @PostMapping
    Allergy create(@RequestBody Allergy obj){
        return allergyService.create(obj);
    }

    @PutMapping
    Allergy update(@RequestBody Allergy obj){
        return allergyService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
        allergyService.delete(id);
    }

}
