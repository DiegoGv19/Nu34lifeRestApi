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

import com.nu34life.model.Instruction;
import com.nu34life.service.InstructionService;


@RestController
@RequestMapping("/api/instruction")
public class InstructionController {

	private InstructionService instructionService;

    @Autowired
    public InstructionController(InstructionService instructionService){
        this.instructionService = instructionService;
    }
    
    @GetMapping
    List<Instruction> all(){
        return instructionService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Instruction> byId(@PathVariable Long id){
        return instructionService.getById(id);
    }

    @PostMapping
    Instruction create(@RequestBody Instruction obj){
        return instructionService.create(obj);
    }

    @PutMapping
    Instruction update(@RequestBody Instruction obj){
        return instructionService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
    	instructionService.delete(id);
    }
}
