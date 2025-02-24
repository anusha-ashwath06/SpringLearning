package com.developer.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.EmployeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
