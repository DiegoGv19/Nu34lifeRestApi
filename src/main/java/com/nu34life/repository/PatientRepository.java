package com.nu34life.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nu34life.model.Nutritionist;
import com.nu34life.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	List<Patient> findByEmail(String email);
}
