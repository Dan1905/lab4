package com.mit.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer type;
	private String value;
	private LocalDateTime date;
	
	
	public Long getId() {
		 return id;
	 }
	public Integer getType() {
		 return type;
	 }
	public String getValue() {
		return value;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setType(Integer type) {
		 this.type = type;
	 }
	public void setValue(String value) {
		 this.value = value;
	 }
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
