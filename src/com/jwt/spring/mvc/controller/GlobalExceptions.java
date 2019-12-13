package com.jwt.spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptions {
	
	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value =NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		
		System.out.println("Null Pointer Exception "+ e);
		return "NullPointerException";
		
	}


}
