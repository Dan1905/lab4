package com.mit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.demo.entity.CustomerName;
import com.mit.demo.repository.CustomerNameRepository;




@Service
public class CustomerNameService {
	@Autowired
	private CustomerNameRepository customerNameRepository;
	    public List<CustomerName> getAllUsers() {
	        return customerNameRepository.findAll();
	}
	    public CustomerName saveUser(CustomerName user) {
	        return customerNameRepository.save(user);
}
}