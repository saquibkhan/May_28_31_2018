package com.intuit.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:lab01.xml");
		AccountService accountService = context.getBean("accountService",AccountService.class);
		accountService.withdraw(1, "Fees", 10);
		System.out.println("Done");
	}

}
