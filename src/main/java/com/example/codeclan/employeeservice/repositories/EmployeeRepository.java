package com.example.codeclan.employeeservice.repositories;

import com.example.codeclan.employeeservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
