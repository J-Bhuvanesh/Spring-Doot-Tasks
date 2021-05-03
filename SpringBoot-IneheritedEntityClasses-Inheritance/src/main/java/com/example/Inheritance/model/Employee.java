package com.example.Inheritance.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_DETAILS")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) 

public abstract class Employee {
	
	@Id
	@GeneratedValue
	private int eid;
	
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee() {}

	public Employee(String ename) {
		super();
		this.ename = ename;
	}
	
	

}
