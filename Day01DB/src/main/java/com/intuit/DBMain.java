package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class DBMain {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		PersonsDao personsDao = context.getBean("personsDao",PersonsDao.class);
		try {
			personsDao.updateAge(1, 13);
		}
		catch(DataAccessException dex) {
			System.out.println("Error " + dex.getCause().getMessage());
		}

		//personsDao.insert("Sam", "Thomas", 12);
		System.out.println("Done");
	}

}
