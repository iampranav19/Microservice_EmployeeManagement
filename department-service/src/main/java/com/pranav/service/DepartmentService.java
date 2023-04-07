package com.pranav.service;

import com.pranav.dto.DepartmentDto;

public interface DepartmentService {

	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	
	DepartmentDto getDepartmentByDepartmentCode(String departmentCode);
	
	
}
