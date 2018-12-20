package com.softpager.icmp.exceptions;

import lombok.Data;

@Data
public class ICMPCostumErrorResponse  {	
	private String message;
	private int status;
	private long timeStamp;
	
	public ICMPCostumErrorResponse(String message, int status, long timeStamp) {	
		this.message = message;
		this.status = status;
		this.timeStamp = timeStamp;
	}
		
}




