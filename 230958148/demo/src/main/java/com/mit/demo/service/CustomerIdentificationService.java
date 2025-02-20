package com.mit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.demo.entity.CustomerIdentification;
import com.mit.demo.repository.CustomerIdentificationRepository;




@Service
public class CustomerIdentificationService {
	@Autowired
	private CustomerIdentificationRepository customerIdentificationRepository;
	    public List<CustomerIdentification> getAllUsers() {
	        return customerIdentificationRepository.findAll();
	}
	    public CustomerIdentification saveUser(CustomerIdentification user) {
	        return customerIdentificationRepository.save(user);
}
}