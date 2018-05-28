package com.intuit;

import java.util.List;

public class Person {
	
	private PANDetails panDetails;
	private String name;
	private Car car;
	private List<String> hobbies;
	
	
	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Person(PANDetails panDetails) {
		this.panDetails = panDetails;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
