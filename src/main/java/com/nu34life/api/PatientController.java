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
import com.nu34life.model.Patient;
import com.nu34life.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

	private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }
    
    @GetMapping
    List<Patient> all(){
        return patientService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Patient> byId(@PathVariable Long id){
        return patientService.getById(id);
    }

    @PostMapping
    Patient create(@RequestBody Patient obj){
        return patientService.create(obj);
    }

    @PutMapping
    Patient update(@RequestBody Patient obj){
        return patientService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	patientService.delete(id);
    }
    
    @RequestMapping(path = "/email/{email}")
    public List<Patient>byEmail(@PathVariable(value = "email") String email) {
    	return patientService.byEmail(email);
    }
}
