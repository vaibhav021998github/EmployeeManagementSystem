package com.employee.Service;

import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);

	public Optional<Employee> findById(Integer empId);

	public List<Employee> getAllEmployeeByCity(String city);

}
