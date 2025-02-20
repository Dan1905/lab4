package com.mit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.demo.entity.CustomerName;
import com.mit.demo.service.CustomerNameService;




@RestController
@RequestMapping("/api/customerName")
public class CustomerNameController {
    @Autowired
    private CustomerNameService customerNameService;
    @GetMapping
    public List<CustomerName> getAllUsers() {
        return customerNameService.getAllUsers();
    }
    @PostMapping
    public CustomerName createUser(@RequestBody CustomerName user) {
        return customerNameService.saveUser(user);
    }
}