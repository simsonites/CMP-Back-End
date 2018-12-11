package com.softpager.cmp.exceptions;

@SuppressWarnings("serial")
public class CMPResourceNotFoundException  extends RuntimeException{

	public CMPResourceNotFoundException() {
		super();
	}

	public CMPResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

	public CMPResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CMPResourceNotFoundException(String message) {
		super(message);
		
	}

	public CMPResourceNotFoundException(Throwable cause) {
		super(cause);
	
	}
	

}
