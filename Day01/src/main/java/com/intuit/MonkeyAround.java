package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MonkeyAround {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:monkey.xml");
		Book book = context.getBean("book",Book.class);
		System.out.println(book.getTitle() + ", " + book.getPrice());
		
		
//		Person person = context.getBean("person",Person.class);
//		System.out.println(person.getHobbies());
//		Person person1 = context.getBean("person2",Person.class);
//		Person person2 = context.getBean("person3",Person.class);
//		System.out.println(person1);
//		System.out.println(person2);
//		System.out.println("Done");
	}

}
