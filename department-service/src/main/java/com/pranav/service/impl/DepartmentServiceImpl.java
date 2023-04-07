package com.pranav.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranav.dto.DepartmentDto;
import com.pranav.entity.Department;
import com.pranav.repository.DepartmentRepsitory;
import com.pranav.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepsitory departmentRepsitory;
	
	
	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		// TODO Auto-generated method stub
		Department department=new Department();
		BeanUtils.copyProperties(departmentDto, department);
		Department savedDepartment = departmentRepsitory.save(department);
		
		DepartmentDto savedDepartmetnDto=new DepartmentDto();
		BeanUtils.copyProperties(savedDepartment, savedDepartmetnDto);
		
		return savedDepartmetnDto; 
	}


	@Override
	public DepartmentDto getDepartmentByDepartmentCode(String departmentCode) {
		// TODO Auto-generated method stub
		Department department = departmentRepsitory.findByDepartmentCode(departmentCode).get();
		DepartmentDto departmentDto=new DepartmentDto();
		BeanUtils.copyProperties(department, departmentDto);
		return departmentDto;
	}

}
