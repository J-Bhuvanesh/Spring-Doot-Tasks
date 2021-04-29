package com.example.O2O.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Table(name="OWNER_TABLE")
public class Owner {
	public Owner() {}
	public Owner(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Id
	@GeneratedValue
	private int owner_id;
	private String name;
	private int age;
	public int getId() {return owner_id;}
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

}
