package com.pranav.service;

import com.pranav.dto.EmployeeDto;

public interface EmployeeService {
    com.pranav.dto.EmployeeDto saveEmployee(EmployeeDto employeeDto);

    com.pranav.dto.APIResponseDto getEmployeeById(Long employeeId);
}
