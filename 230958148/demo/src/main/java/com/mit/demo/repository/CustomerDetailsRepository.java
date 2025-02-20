package com.mit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.demo.entity.CustomerDetails;


public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails , Long>{

}

