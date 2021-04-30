package com.example.Validation.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="PRODUCT_TABLE",
uniqueConstraints=@UniqueConstraint(name="uk_PRODUCT_TABLE_product_model",
columnNames = { "product_model" }),
indexes=@Index(name=("idx_PRODUCT_TABLE_id_name_product_model_quantity_price"),
columnList="id,name,product_model,quantity,price"))

public class Product {
	                                                            
	@Id
	@GeneratedValue                                              
	private int id;
	@NotNull
	@Size(min=3,max=10,message="enter valid name for product")
	private String name;
	@NotNull
	@Size(min=3,max=10,message="enter valid product_model number")
	private String product_model;

	public String getProduct_model() {
		return product_model;
	}
	public void setProduct_model(String product_model) {
		this.product_model = product_model;
	}
	@Min(1)
	private int quantity;
	@Min(500)
	@Max(50000)
	private double price;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}}




