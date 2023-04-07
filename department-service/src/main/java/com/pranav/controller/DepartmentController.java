package com.pranav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.dto.DepartmentDto;
import com.pranav.service.DepartmentService;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	/*
	 * JSON
	{
    "departmentName" : "HR",
    "departmentDescription" : "Human Resources",
    "departmentCode": "HR001"
	} 
	 */

	
	
	
	// API For Saving the Department 
	@PostMapping
	public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto)
	{
		DepartmentDto saveDepartment = departmentService.saveDepartment(departmentDto);
		return new ResponseEntity<>(saveDepartment,HttpStatus.CREATED);
	}
	
	
	// API to get the Department Based on the Department Code
	@GetMapping("{departmentCode}")
	public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable String departmentCode)
	{
		DepartmentDto department = departmentService.getDepartmentByDepartmentCode(departmentCode);
		return new ResponseEntity<>(department,HttpStatus.OK);
	}
}
