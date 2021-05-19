package com.facebook.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users",
uniqueConstraints=@UniqueConstraint(
columnNames = { "email" }),
indexes=@Index(name=("users_id"),
columnList="id"))
@FieldDefaults(level=AccessLevel.PRIVATE)

public class User extends BaseEntity{
	
	@Id
	@GeneratedValue
	@Column(name="id",updatable=false,nullable=false)
	long id;
	@Column(name="first_name")
	@NotNull
	@Size(min=3,max=15,message="enter valid first name")
	String firstName;
	
	@Column(name="age")
	@NotNull
	@Min(12)
	@Max(50)
	int age;

	@Column(name="email",unique=true)
	@Email
	@NotNull
	String email;
	
	@Column(name="location")
	@Size(min=3,max=15,message="the location must have minimum three letters")
	@NotNull
	String location;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User(String firstName,int age, String email, String location) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.email = email;
		this.location = location;
	}

	public User() {
		super();
	}


}
