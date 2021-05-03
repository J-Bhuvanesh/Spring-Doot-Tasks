package com.example.Inheritance.model;

import javax.persistence.Entity;

@Entity
public class RetiredEmployee extends Employee{
	
	private int epension;

	



	public RetiredEmployee() {
		super();
		
	}


	public RetiredEmployee(String ename,int epension) {
		super(ename);
		this.epension = epension;
		// TODO Auto-generated constructor stub
	}

	public int getEpension() {
		return epension;
	}

	public void setEpension(int epension) {
		this.epension = epension;
	}
	

}
