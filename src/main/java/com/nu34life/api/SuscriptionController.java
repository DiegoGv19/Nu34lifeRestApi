package com.nu34life.api;

import com.nu34life.model.Suscription;
import com.nu34life.service.SuscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/suscription")
public class SuscriptionController {

    private SuscriptionService suscriptionService;

    @Autowired
    public SuscriptionController(SuscriptionService suscriptionService){this.suscriptionService = suscriptionService;}


    @GetMapping
    List<Suscription> all(){
        return suscriptionService.listAll();
    }

    @GetMapping(path = "/{id}")
    Optional<Suscription> byId(@PathVariable Long id){
        return suscriptionService.getById(id);
    }

    @PostMapping
    Suscription create(@RequestBody Suscription obj){
        return suscriptionService.create(obj);
    }

    @PutMapping
    Suscription update(@RequestBody Suscription obj){
        return suscriptionService.update(obj);
    }

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id){
        suscriptionService.delete(id);
    }

}
