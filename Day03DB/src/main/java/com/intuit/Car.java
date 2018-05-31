package com.intuit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	@Id
	private int id;
	
	@Column
	private String model;
	
	@Column(name="year")
	private long yearOfMake;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getYearOfMake() {
		return yearOfMake;
	}
	public void setYearOfMake(long yearOfMake) {
		this.yearOfMake = yearOfMake;
	}
	
	
}
