package com.developer.EmployeeManagementSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeResourceNotfFountException extends RuntimeException {
	public EmployeeResourceNotfFountException(String message) {
		super(message);
	}
	

}
