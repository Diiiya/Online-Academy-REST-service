package com.onlineAcademy.service.RESTservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Error {

	private String errorMessage;
	private int errorCode;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	public Error() {
		
	}
	
	public Error(String errorMessage, int errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	
}
