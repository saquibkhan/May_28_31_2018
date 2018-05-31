package com.intuit;

public class Game {

	private int target;
	private int attempts;
	private String message;
	private boolean gameOver;
	
	public Game() {
		target = (int)(Math.random()*100);
	}
	public int getTarget() {
		return target;
	}
	public int getAttempts() {
		return attempts;
	}
	public String getMessage() {
		return message;
	}
	public void play(int guess) {
		if(gameOver)
			throw new GameOverException();
		attempts++;
		if(guess < target)
			message = "Aim Higher";
		else if(guess > target)
			message = "Aim Lower";
		else {
			message =  "You've got it!!!";
			gameOver = true;
		}
	}

}
