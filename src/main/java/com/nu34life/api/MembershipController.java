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

import com.nu34life.model.Membership;
import com.nu34life.service.MembershipService;

@RestController
@RequestMapping("/api/membership")
public class MembershipController {
	private MembershipService membershipService;
	
	 @Autowired
	    public MembershipController( MembershipService membershipService){
	        this.membershipService = membershipService;
	    }
	    
	    @GetMapping
	    List<Membership> all(){
	        return membershipService.listAll();
	    }

	    @GetMapping(path = "/{id}")
	    Optional<Membership> byId(@PathVariable Long id){
	        return membershipService.getById(id);
	    }

	    @PostMapping
	    Membership create(@RequestBody Membership obj){
	        return membershipService.create(obj);
	    }

	    @PutMapping
	    Membership update(@RequestBody Membership obj){
	        return membershipService.update(obj);
	    }

	    @DeleteMapping(path = "/{id}")
	    void delete(@PathVariable Long id){
	    	membershipService.delete(id);
	    }
	
}
