package com.mit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.demo.entity.CustomerDetails;
import com.mit.demo.repository.CustomerDetailsRepository;



@Service
public class CustomerDetailsService {
	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;
	    public List<CustomerDetails> getAllUsers() {
	        return customerDetailsRepository.findAll();
	}
	    public CustomerDetails saveUser(CustomerDetails user) {
	        return customerDetailsRepository.save(user);
}
}


