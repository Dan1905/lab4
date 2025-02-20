package com.mit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.demo.entity.CustomerDetails;
import com.mit.demo.service.CustomerDetailsService;


@RestController
@RequestMapping("/api/customerDetails")
public class CustomerDetailsController {
    @Autowired
    private CustomerDetailsService customerDetailsService;
    @GetMapping
    public List<CustomerDetails> getAllUsers() {
        return customerDetailsService.getAllUsers();
    }
@PostMapping
public CustomerDetails createUser(@RequestBody CustomerDetails user) {
        return customerDetailsService.saveUser(user);
    }
}
