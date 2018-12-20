package com.softpager.icmp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ICMPGlobalExceptionHandler {	
	
	@ExceptionHandler
	public ResponseEntity<ICMPCostumErrorResponse> handleError(ICMPResourceNotFoundException exc){
		ICMPCostumErrorResponse error = new ICMPCostumErrorResponse(
				exc.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
		return  new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ICMPCostumErrorResponse> handleError(Exception exc){
		ICMPCostumErrorResponse error = new ICMPCostumErrorResponse(
				exc.getMessage(), HttpStatus.BAD_REQUEST.value(), System.currentTimeMillis());
		return  new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}






















