package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Door door = DoorFactory.getDoorWithSoundAlarm();
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		Door door = context.getBean("door2",Door.class);
		door.open();
		door.close();
	}
}
