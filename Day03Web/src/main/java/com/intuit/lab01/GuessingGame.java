package com.intuit.lab01;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="session",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class GuessingGame {
	private int target;
	private String message;
	private int attempts;
	
	public GuessingGame() {
		target = (int)(Math.random()*100);
	}
	public void play(int guess) {
		attempts++;
		if(guess > target)
			message = "Aim Lower";
		else if(guess < target)
			message = "Aim Higher";
		else
			message = "You've got it!!!";
	}
	public int getTarget() {
		return target;
	}
	public String getMessage() {
		return message;
	}
	public int getAttempts() {
		return attempts;
	}
	
	
}
