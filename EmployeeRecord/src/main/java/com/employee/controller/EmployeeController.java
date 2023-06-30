package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.employee.Service.EmployeeService;
import com.employee.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/home")
	public String homePage() {
		return "WelCome";
	}
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee emp) {
		Employee employee=employeeService.saveEmployee(emp);
		return "Record is Sucessfully Saved...";
	}
	
	@GetMapping("/get/{empId}")
	 Optional<Employee> getEmployeeById(@PathVariable("empId")Integer empId) {
		return employeeService.findById(empId);
	}
	@GetMapping("/getcity/{city}")
	public ResponseEntity<List<Employee>> getAllEmployeeByCity(@PathVariable("city")String city){
	List <Employee>employees= employeeService.getAllEmployeeByCity(city);
	return ResponseEntity.ok().body(employees);
	}
	
	}

