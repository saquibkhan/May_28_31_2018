package com.intuit.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args)throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:lab01.xml");
		AccountService accountService = context.getBean("accountService",AccountService.class);
		System.out.println("***********************************");
		System.out.println(accountService.getClass().getName());
		//accountService.deposit(1, "Deposit", 1000);
		accountService.withdraw(1, "Withdraw", 1000);
		System.out.println("Done");
	}

}
