package com.nu34life.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nu34life.model.Drug;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Long>{

}
