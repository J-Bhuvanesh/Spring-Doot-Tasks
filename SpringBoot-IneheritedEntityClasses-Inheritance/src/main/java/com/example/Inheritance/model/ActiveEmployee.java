package com.example.Inheritance.model;

import javax.persistence.Entity;

@Entity

public class ActiveEmployee extends Employee{
	
	private int esalary;
	private int eexperience;
	public ActiveEmployee() {}
	public ActiveEmployee(String ename,int esalary,int eexperience) {
		super(ename);
		this.esalary=esalary;
		this.eexperience=eexperience;
	
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public int getEexperience() {
		return eexperience;
	}
	public void setEexperience(int eexperience) {
		this.eexperience = eexperience;
	}
	
	
	
	

}
