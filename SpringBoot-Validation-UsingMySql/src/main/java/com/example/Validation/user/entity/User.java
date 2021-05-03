package com.example.Validation.user.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

@Entity
@Table(name="USER_TABLE")
public class User {
	
	@Id
	@GeneratedValue   
	
	private int id;
	
	@Column(name="user_name")
	private String name;
	@Column(name="product")
	private String product;
	@Column(name="rating")
	@Max(10)
	private int rating;
	public User() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public User(int id, String name, String product, @Max(10) int rating) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
		this.rating = rating;
	}
	

}
