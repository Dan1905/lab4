package com.mit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.demo.entity.CustomerIdentification;



public interface CustomerIdentificationRepository extends JpaRepository<CustomerIdentification , Long> {

}
