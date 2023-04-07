package com.pranav.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.entity.Department;

public interface DepartmentRepsitory extends JpaRepository<Department, Long> {

		Optional<Department> findByDepartmentCode(String departmentCode);
}
