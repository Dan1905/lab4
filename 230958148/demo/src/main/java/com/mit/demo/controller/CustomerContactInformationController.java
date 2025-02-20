package com.mit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.demo.entity.CustomerContactInformation;
import com.mit.demo.service.CustomerContactInformationService;


@RestController
@RequestMapping("/api/customerContactInformation")
public class CustomerContactInformationController {
    @Autowired
    private CustomerContactInformationService customerContactInformationService;
    @GetMapping
    public List<CustomerContactInformation> getAllUsers() {
        return customerContactInformationService.getAllUsers();
    }
@PostMapping
public CustomerContactInformation createUser(@RequestBody CustomerContactInformation user) {
        return customerContactInformationService.saveUser(user);
    }
}
