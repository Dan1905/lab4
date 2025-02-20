package com.mit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.demo.entity.CustomerContactInformation;
import com.mit.demo.repository.CustomerContactInformationRepository;

@Service
public class CustomerContactInformationService {
	@Autowired
	private CustomerContactInformationRepository customerContactInformationRepository;
	    public List<CustomerContactInformation> getAllUsers() {
	        return customerContactInformationRepository.findAll();
	}
	    public CustomerContactInformation saveUser(CustomerContactInformation user) {
	        return customerContactInformationRepository.save(user);
}
}
