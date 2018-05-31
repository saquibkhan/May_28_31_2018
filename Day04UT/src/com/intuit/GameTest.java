package com.intuit;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game game;
	
	
	@Test(expected=GameOverException.class)	
	public void testPlayGameAfterItsOver() throws Exception{
		setTarget(55);
		game.play(55);
		game.play(50);
	}
	
	@Test
	public void testMessageIsYouHaveGotIt() throws Exception{
		setTarget(55);
		game.play(55);
		assertTrue("You've got it!!!".equals(game.getMessage()));
	}
	
	@Test
	public void testMessageIsAimLower() throws Exception{
		setTarget(55);
		game.play(65);
		assertTrue("Aim Lower".equals(game.getMessage()));
	}
	
	@Test
	public void testMessageIsAimHigher() throws Exception{
		setTarget(55);
		game.play(50);
		assertTrue("Aim Higher".equals(game.getMessage()));
	}
	private void setTarget(int target) throws NoSuchFieldException, IllegalAccessException {
		Field targetField = game.getClass().getDeclaredField("target");
		targetField.setAccessible(true);
		targetField.set(game, target);
	}
	@Test
	public void testAttemptsAgainWhenGameIsPlayed() {
		game.play(50);
		game.play(45);
		game.play(55);
		assertTrue(game.getAttempts() == 3);
	}
	
	@Test
	public void testAttemptsWhenGameIsPlayed() {
		game.play(50);
		assertTrue(game.getAttempts() == 1);
	}
	
	@Test
	public void testMessageIsBlankInTheBeginning() {
		assertTrue(game.getMessage() == null);
	}
	
	@Test
	public void testAttemptsIsZeroInTheBeginning() {
		assertTrue(game.getAttempts() == 0);
	}
	
	@Test
	public void testTargetIsGenerated() {
		assertTrue(game.getTarget() > 0);
	}
	
	@Test
	public void testTargetGeneratedIsBetween1And100() {
		assertTrue(game.getTarget() >= 1 && game.getTarget() <= 100);
	}
	
	
	@Before
	public void setUp() throws Exception {
		game = new Game();
	}

	@After
	public void tearDown() throws Exception {
		game = null;
	}

	@Test
	public void testSetUp() {
		assertNotNull(game);
	}

}
