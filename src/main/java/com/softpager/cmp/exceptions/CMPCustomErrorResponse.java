package com.softpager.cmp.exceptions;

import lombok.Data;

@Data
public class CMPCustomErrorResponse {
	
	private int status;
	private  String message;	
	private long timeStamp;
	
	
	public CMPCustomErrorResponse(int status, String message, long timeStamp) {	
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	

}
