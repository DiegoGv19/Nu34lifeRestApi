package com.nu34life.service;

import java.util.List;

import com.nu34life.model.Patient;

public interface PatientService extends CrudService<Patient>{
	List<Patient>byEmail(String email);

}
