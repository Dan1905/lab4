package com.mit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.demo.entity.CustomerName;



public interface CustomerNameRepository extends JpaRepository<CustomerName , Long>{

}
