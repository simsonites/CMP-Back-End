package com.softpager.cmp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CMPGlobalExceptionHandler {	
	
	@ExceptionHandler
	public ResponseEntity<CMPCustomErrorResponse> handleException(CMPResourceNotFoundException  exc){
		CMPCustomErrorResponse error = new CMPCustomErrorResponse(HttpStatus.NOT_FOUND.value(),
				                                                  exc.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<CMPCustomErrorResponse> handleException(Exception  exc){
		CMPCustomErrorResponse error = new CMPCustomErrorResponse(HttpStatus.BAD_REQUEST.value(),
				                                                  exc.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}













