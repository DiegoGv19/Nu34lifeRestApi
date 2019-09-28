package com.nu34life.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nu34life.model.Membership;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, Long>{

}
