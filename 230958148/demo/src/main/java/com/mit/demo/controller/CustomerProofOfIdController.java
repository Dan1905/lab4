package com.mit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.demo.entity.CustomerProofOfId;
import com.mit.demo.service.CustomerProofOfIdService;


@RestController
@RequestMapping("/api/customerProofOfId")
public class CustomerProofOfIdController{
    @Autowired
    private CustomerProofOfIdService customerProofOfIdService;
    @GetMapping
    public List<CustomerProofOfId> getAllUsers() {
        return customerProofOfIdService.getAllUsers();
    }
    @PostMapping
    public CustomerProofOfId createUser(@RequestBody CustomerProofOfId user) {
        return customerProofOfIdService.saveUser(user);
    }
}