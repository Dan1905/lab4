package com.mit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.demo.entity.CustomerProofOfId;
import com.mit.demo.repository.CustomerProofOfIdRepository;


@Service
public class CustomerProofOfIdService {
	@Autowired
	private CustomerProofOfIdRepository customerProofOfIdRepository;
	    public List<CustomerProofOfId> getAllUsers() {
	        return customerProofOfIdRepository.findAll();
	}
	    public CustomerProofOfId saveUser(CustomerProofOfId user) {
	        return customerProofOfIdRepository.save(user);
}}
