package com.intuit.lab01;

public class Conference {
	private SessionPlanner sessionPlanner;

	public void setSessionPlanner(SessionPlanner sessionPlanner) {
		this.sessionPlanner = sessionPlanner;
	}
	
	public int getCountOf60MinTopics() {
		return sessionPlanner.get60MinTopicsCount();
	}
	
	public int getCountOf50MinTopics() {
		return sessionPlanner.get50MinTopicsCount();
	}
	
	public int getCountOf45MinTopics() {
		return sessionPlanner.get45MinTopicsCount();
	}
	
}
