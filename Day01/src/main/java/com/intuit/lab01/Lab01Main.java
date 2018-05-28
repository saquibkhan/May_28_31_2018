package com.intuit.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Lab01Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:lab01.xml");
		Conference conference = context.getBean("conference",Conference.class);
		System.out.println("60 Min Topics: " + conference.getCountOf60MinTopics());
		System.out.println("50 Min Topics: " + conference.getCountOf50MinTopics());
		System.out.println("45 Min Topics: " + conference.getCountOf45MinTopics());
	}

}
