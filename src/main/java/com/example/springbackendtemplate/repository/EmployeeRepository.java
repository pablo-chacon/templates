package com.example.springbackendtemplate.repository;

import com.example.springbackendtemplate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}