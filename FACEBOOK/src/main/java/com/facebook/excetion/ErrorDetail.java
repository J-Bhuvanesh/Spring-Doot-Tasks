package com.facebook.excetion;

public class ErrorDetail {
	
	private String message;
	private String details;
	private String path;
	private String descriton;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDescriton() {
		return descriton;
	}
	public void setDescriton(String descriton) {
		this.descriton = descriton;
	}public ErrorDetail(){}
	public ErrorDetail(String message, String details, String path, String descriton) {
		super();
		this.message = message;
		this.details = details;
		this.path = path;
		this.descriton = descriton;
	}
	

}
