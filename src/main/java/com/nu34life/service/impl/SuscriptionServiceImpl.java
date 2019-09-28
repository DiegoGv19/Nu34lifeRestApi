package com.nu34life.service.impl;

import com.nu34life.model.Suscription;
import com.nu34life.repository.SuscriptionRepository;
import com.nu34life.service.SuscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuscriptionServiceImpl implements SuscriptionService {

    private SuscriptionRepository suscriptionRepository;

    @Autowired
    public SuscriptionServiceImpl(SuscriptionRepository suscriptionRepository){this.suscriptionRepository = suscriptionRepository;}

    @Override
    public List<Suscription> listAll() {
        return suscriptionRepository.findAll();
    }

    @Override
    public Optional<Suscription> getById(Long id) {
        return suscriptionRepository.findById(id);
    }

    @Override
    public Suscription create(Suscription object) {
        return suscriptionRepository.save(object);
    }

    @Override
    public Suscription update(Suscription object) {
        return suscriptionRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        suscriptionRepository.deleteById(id);
    }
}
