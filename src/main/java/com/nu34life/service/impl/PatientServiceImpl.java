package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.Nutritionist;
import com.nu34life.model.Patient;
import com.nu34life.repository.PatientRepository;
import com.nu34life.service.PatientService;


@Service
public class PatientServiceImpl implements PatientService{
	private PatientRepository patientRepository;

		
	@Autowired
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository; 
	}


	@Override
	public List<Patient> listAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}


	@Override
	public Optional<Patient> getById(Long id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id);
	}


	@Override
	public Patient create(Patient object) {
		// TODO Auto-generated method stub
		return patientRepository.save(object);
	}


	@Override
	public Patient update(Patient object) {
		// TODO Auto-generated method stub
		return patientRepository.save(object);
	}


	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
	}
	
	@Override
	public List<Patient>byEmail(String email){
		return patientRepository.findByEmail(email);
	}
}
