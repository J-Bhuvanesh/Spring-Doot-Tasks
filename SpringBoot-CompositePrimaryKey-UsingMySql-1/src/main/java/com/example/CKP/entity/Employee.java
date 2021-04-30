package com.example.CKP.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "Employee",indexes= {@Index(name="idx_employee_email_phone",columnList="email,phone")})
@IdClass(EmployeeCPKId.class)
public class Employee {
  @Id
  private int employeeId;
  @Id
  private int deptId;



	@Column(name="name")
	@NotNull
	@Size(min=4)
    private String name;
	
	@Column(name="email",unique=true)
	@Email
    private String email;
	
	@Column(name="phone",unique=true)
	@NotNull
	@Size(min=10,max=10)
    private String phone;
	public Employee(){}
	public Employee(int employeeId,int deptId,String name,String email,
		 String phone) {
		super();
		this.employeeId=employeeId;
		this.deptId=deptId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}