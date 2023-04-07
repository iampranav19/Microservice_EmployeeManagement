package com.pranav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
