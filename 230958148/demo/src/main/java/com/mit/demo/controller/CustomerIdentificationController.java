package com.mit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.demo.entity.CustomerIdentification;
import com.mit.demo.service.CustomerIdentificationService;




	@RestController
	@RequestMapping("/api/customerIdentification")
	public class CustomerIdentificationController {
	    @Autowired
	    private CustomerIdentificationService customerIdentificationService;
	    @GetMapping
	    public List<CustomerIdentification> getAllUsers() {
	        return customerIdentificationService.getAllUsers();
	    }
	@PostMapping
	public CustomerIdentification createUser(@RequestBody CustomerIdentification user) {
	        return customerIdentificationService.saveUser(user);
	    }
	}

