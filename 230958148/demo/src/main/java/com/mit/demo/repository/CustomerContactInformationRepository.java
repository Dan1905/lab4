package com.mit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.demo.entity.CustomerContactInformation;



public interface CustomerContactInformationRepository extends JpaRepository<CustomerContactInformation , Long>{

}
