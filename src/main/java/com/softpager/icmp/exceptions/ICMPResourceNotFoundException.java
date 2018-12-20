package com.softpager.icmp.exceptions;

@SuppressWarnings("serial")
public class ICMPResourceNotFoundException extends RuntimeException {

	public ICMPResourceNotFoundException() {
		super();	
	}

	public ICMPResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);	
	}

	public ICMPResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);	
	}

	public ICMPResourceNotFoundException(String message) {
		super(message);		
	}

	public ICMPResourceNotFoundException(Throwable cause) {
		super(cause);		
	}
		

}
