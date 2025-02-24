package com.developer.EmployeeManagementSystem.Controller;

import java.net.http.HttpResponse.BodyHandler;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.EmployeeManagementSystem.Service.EmployeeService;
import com.developer.EmployeeManagementSystem.dto.EmployeeDto;
import com.developer.EmployeeManagementSystem.mapper.EmployeeMapper;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@PostMapping
	public ResponseEntity<EmployeeDto> createNewEmployee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto savedEmployee = employeeService.createNewEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
		List<EmployeeDto> allEmployeesDtos = employeeService.getAllEmployees();
		return new ResponseEntity<>(allEmployeesDtos, HttpStatus.OK);
	}
	@GetMapping("/{employeeId}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("employeeId") long employeeId){
		EmployeeDto employeeById = employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<>(employeeById, HttpStatus.OK);
	}
    @PutMapping("/{employeeId}")
	public ResponseEntity<EmployeeDto> updateEmployeeById(@PathVariable("employeeId") long employeeId, @RequestBody EmployeeDto employeeDto){
    	EmployeeDto employeeById = employeeService.updateEmployeeById(employeeId, employeeDto);
    	return new ResponseEntity<>(employeeById, HttpStatus.OK);
    	
    }
    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("employeeId") long employeeId){
    	employeeService.deleteEmployeeById(employeeId);
    	return new ResponseEntity<>("Employee record deleted", HttpStatus.OK );
    }
}
