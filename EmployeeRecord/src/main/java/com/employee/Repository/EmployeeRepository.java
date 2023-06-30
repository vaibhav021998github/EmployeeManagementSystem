 package com.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	@Query(value="select * from employee where city=?", nativeQuery = true)
	List<Employee> findByCity(String city);

}
