package com.developer.EmployeeManagementSystem.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.developer.EmployeeManagementSystem.dto.EmployeeDto;
import com.developer.EmployeeManagementSystem.entity.Employee;
import com.developer.EmployeeManagementSystem.exception.EmployeeResourceNotfFountException;
import com.developer.EmployeeManagementSystem.mapper.EmployeeMapper;
import com.developer.EmployeeManagementSystem.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	@Override
	public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
		Employee newEmployee = EmployeeMapper.maptoEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(newEmployee);
		return EmployeeMapper.maptoEmployeeDto(savedEmployee);
		}
	@Override
	public List<EmployeeDto> getAllEmployees(){
		List<Employee> allEmployees = employeeRepository.findAll();
		return allEmployees.stream().map((e)-> EmployeeMapper.maptoEmployeeDto(e)).collect(Collectors.toList());
	}
	@Override
	public EmployeeDto getEmployeeById(long id) {
		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new EmployeeResourceNotfFountException("employee id does'nt exist"));
        return EmployeeMapper.maptoEmployeeDto(employee);
	}
	@Override
	 public EmployeeDto updateEmployeeById(long employeeId, EmployeeDto employeeDto){
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeResourceNotfFountException("Employee ID doesn't exist"));
		employee.setId(employee.getId());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setEmail(employeeDto.getEmail());
		employeeRepository.save(employee);
		return EmployeeMapper.maptoEmployeeDto(employee);
		
		}
	@Override
	public void deleteEmployeeById(long employeeId) {
	Employee employee = employeeRepository.findById(employeeId).orElseThrow(()-> new EmployeeResourceNotfFountException("Employee ID not found"));
	employeeRepository.deleteById(employeeId);
	}

	
}
