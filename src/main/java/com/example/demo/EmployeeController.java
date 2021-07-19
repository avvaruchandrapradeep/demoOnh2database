package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value="/Employees")
	public List<Employee> employeeList()
	{
		
		return employeeService.findAll();
	}
	
	@GetMapping("/Employees/{id}")
	public Employee fetchEmployee(@PathVariable int id)
	{
		return employeeService.getById(id);
	}

	@PutMapping("/Employees")
	public void addEmployee(Employee e)
	{
		employeeService.save(e);
	}
}
