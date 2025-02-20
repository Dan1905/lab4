package com.mit.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerIdentification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long CustomerId;
	private Integer type;
	private String item;
	private LocalDateTime effectiveDate;
	
	public Long getId() {
		return id;
	}
	public Long GetCustomerId() {
		return CustomerId;
	}
	public Integer GetType() {
		return type;
	}
	public String GetItem() {
		return item;
	}
	public LocalDateTime getEffectiveDate() {
		return effectiveDate;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setCustomerId(Long CustomerId) {
		this.CustomerId = CustomerId;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setEffectiveDate(LocalDateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
	
}
