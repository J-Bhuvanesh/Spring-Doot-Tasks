package com.example.O2O.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
@Table(name="CAR_TABLE")

public class Car {
	public Car() {}
	public Car(String car_name, int chaseno) {
		super();
		
		this.car_name = car_name;
		this.chaseno = chaseno;
	}
	@Id
	@GeneratedValue
	private int car_id;
	private String car_name;
	private int chaseno;
	@OneToOne
	@JoinColumn(name="owner_id",referencedColumnName="owner_id")
	private Owner owner;
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public int getChaseno() {
		return chaseno;
	}
	public void setChaseno(int chaseno) {
		this.chaseno = chaseno;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
