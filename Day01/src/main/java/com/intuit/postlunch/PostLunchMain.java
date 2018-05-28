package com.intuit.postlunch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PostLunchMain {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:postlunch.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person.getName());
		System.out.println(person.getCar());
		System.out.println(person.getHobbies());
		Person person2 = context.getBean("person",Person.class);
		System.out.println(person2);
	}

}
