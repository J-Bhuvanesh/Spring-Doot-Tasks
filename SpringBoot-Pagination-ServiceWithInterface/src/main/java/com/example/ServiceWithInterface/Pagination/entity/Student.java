package com.example.ServiceWithInterface.Pagination.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_student")

public class Student {
	
	
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private String scity;
	public Student() {}
	public Student(String sname, String scity) {
		super();
		this.sname = sname;
		this.scity = scity;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	


}
