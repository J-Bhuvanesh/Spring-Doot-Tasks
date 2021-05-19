package com.facebook.excetion;

import org.springframework.stereotype.Component;
@Component
public class NoSuchNameNotFoundException  extends RuntimeException{
	
	private String errorCode;
	private String errorMessage;
	public NoSuchNameNotFoundException() {}
	public NoSuchNameNotFoundException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
