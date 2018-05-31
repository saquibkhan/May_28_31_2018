package com.intuit;


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
