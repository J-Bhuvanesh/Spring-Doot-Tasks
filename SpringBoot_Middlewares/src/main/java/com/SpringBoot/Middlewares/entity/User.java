package com.SpringBoot.Middlewares.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public User() {}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
