package com.intuit.postlunch;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("myperson")
@Component
@Scope(value="prototype")
public class Person {
	
	@Resource(name="hobbiesList")
	private List<String> hobbies;
	
	@Value("Sam")
	private String name;

	@Autowired
	private Car car;
	
	public List<String> getHobbies() {
		return hobbies;
	}

	public Car getCar() {
		return car;
	}

	public String getName() {
		return name;
	}
	
}
