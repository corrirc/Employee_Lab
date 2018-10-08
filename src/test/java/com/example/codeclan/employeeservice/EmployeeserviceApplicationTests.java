package com.example.codeclan.employeeservice;

import com.example.codeclan.employeeservice.models.Employee;
import com.example.codeclan.employeeservice.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void canCreateEmployee() {
		Employee employee = new Employee("Ricky", 33, 12345, "rc@codeclan.com" );
		employeeRepository.save(employee);
	}
}
