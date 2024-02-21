package com.student.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentsNotFoundException.class)
	public ResponseEntity<ErrorResponse> studentNotFound(StudentsNotFoundException e)
	{
		ErrorResponse response=new ErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Date());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
}
