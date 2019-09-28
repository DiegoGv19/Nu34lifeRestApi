package com.nu34life.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nu34life.model.Suscription;
import org.springframework.stereotype.Repository;

@Repository
public interface SuscriptionRepository extends JpaRepository<Suscription, Long>{

}
