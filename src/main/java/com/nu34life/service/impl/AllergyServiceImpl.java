package com.nu34life.service.impl;

import com.nu34life.model.Allergy;
import com.nu34life.repository.AllergyRepository;
import com.nu34life.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AllergyServiceImpl implements AllergyService {

    private AllergyRepository allergyRepository;

    @Autowired
    public AllergyServiceImpl(AllergyRepository allergyRepository){this.allergyRepository = allergyRepository;}

    @Override
    public List<Allergy> listAll() {
        return allergyRepository.findAll();
    }

    @Override
    public Optional<Allergy> getById(Long id) {
        return allergyRepository.findById(id);
    }

    @Override
    public Allergy create(Allergy object) {
        return allergyRepository.save(object);
    }

    @Override
    public Allergy update(Allergy object) {
        return allergyRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        allergyRepository.deleteById(id);
    }
}
