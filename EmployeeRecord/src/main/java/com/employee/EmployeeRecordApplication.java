package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.transaction.Transactional;

@SpringBootApplication

public class EmployeeRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRecordApplication.class, args);
	}

}
