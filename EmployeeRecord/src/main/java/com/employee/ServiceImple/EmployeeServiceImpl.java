package com.employee.ServiceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.employee.Repository.EmployeeRepository;
import com.employee.Service.EmployeeService;
import com.employee.model.Employee;

import jakarta.transaction.Transactional;
@Service

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public Optional<Employee> findById(Integer empId) {
		
		return employeeRepository.findById(empId);
	}

	@Override
	public List<Employee> getAllEmployeeByCity(String city) {
		
		return employeeRepository.findByCity(city);
	}

}
