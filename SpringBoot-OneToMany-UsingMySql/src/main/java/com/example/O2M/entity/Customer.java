package com.example.O2M.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="CUS_TABLE")
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;
    @OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
    @JoinColumn(name="CUSTOMER_FK",referencedColumnName="id")
    private List<Product> products;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}