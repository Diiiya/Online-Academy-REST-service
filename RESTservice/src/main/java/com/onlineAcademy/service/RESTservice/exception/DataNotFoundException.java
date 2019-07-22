package com.onlineAcademy.service.RESTservice.exception;

public class DataNotFoundException extends RuntimeException {

	private static final long num = 987654321L;
	
	public DataNotFoundException(String message) {
		super(message);
	}
	
}
