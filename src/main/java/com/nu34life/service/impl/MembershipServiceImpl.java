package com.nu34life.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu34life.model.Membership;
import com.nu34life.repository.MembershipRepository;
import com.nu34life.service.MembershipService;

@Service
public class MembershipServiceImpl implements MembershipService{
	private MembershipRepository membershipRepository;

	@Autowired
	public MembershipServiceImpl(MembershipRepository membershipRepository) {
		this.membershipRepository = membershipRepository;
		
	}

	@Override
	public List<Membership> listAll() {
		// TODO Auto-generated method stub
		return membershipRepository.findAll();
	}

	@Override
	public Optional<Membership> getById(Long id) {
		// TODO Auto-generated method stub
		return membershipRepository.findById(id);
	}

	@Override
	public Membership create(Membership object) {
		// TODO Auto-generated method stub
		return membershipRepository.save(object);
	}

	@Override
	public Membership update(Membership object) {
		// TODO Auto-generated method stub
		return membershipRepository.save(object);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		membershipRepository.deleteById(id);
	}
}
