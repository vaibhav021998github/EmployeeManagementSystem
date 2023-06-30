package com.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
Integer empId;
String name;
String city;
double salary;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer empId, String name, String city, double salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.city = city;
	this.salary = salary;
}

}
