package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {

	@GeneratedValue
	@Id
	private int id;
	private String name;
	private String designation;
	private String location;
	
	public Employee(int id, String name, String designation, String location) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.location = location;
	}
	public Employee(String name, String designation, String location) {
		super();
		this.name = name;
		this.designation = designation;
		this.location = location;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", location=" + location
				+ "]";
	}
	
	
}
