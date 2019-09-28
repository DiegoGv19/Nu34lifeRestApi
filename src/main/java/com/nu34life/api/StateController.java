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

import com.nu34life.model.State;
import com.nu34life.service.StateService;

@RestController
@RequestMapping("/api/state")
public class StateController {
	
	private StateService stateService;
	
    @Autowired
    public StateController(StateService stateService){
        this.stateService = stateService;
    }
    
    @GetMapping
    List<State> all(){
        return stateService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<State> byId(@PathVariable Long id){
        return stateService.getById(id);
    }

    @PostMapping
    State create(@RequestBody State obj){
        return stateService.create(obj);
    }

    @PutMapping
    State update(@RequestBody State obj){
        return stateService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	stateService.delete(id);
    }
}
