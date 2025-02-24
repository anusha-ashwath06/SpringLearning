package com.developer.EmployeeManagementSystem.Service;

import java.util.List;

import com.developer.EmployeeManagementSystem.dto.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto createNewEmployee(EmployeeDto employeeDto);

	public List<EmployeeDto> getAllEmployees();

	public EmployeeDto getEmployeeById(long id);


	public EmployeeDto updateEmployeeById(long employeeId, EmployeeDto employeeDto);

	public void deleteEmployeeById(long employeeId) ;
	

}
