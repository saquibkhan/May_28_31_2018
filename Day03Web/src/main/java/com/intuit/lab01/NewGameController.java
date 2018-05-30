package com.intuit.lab01;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewGameController {

	@Autowired
	private GuessingGame guessingGame;
	
	@GetMapping("/game")
	public String index() {
		return "lab01/index";
	}
	
	@PostMapping("/play")
	public String playGame(@RequestParam int guess,Model model) {
		guessingGame.play(guess);
		model.addAttribute("message",guessingGame.getMessage());
		model.addAttribute("attempts","Attempts: " + guessingGame.getAttempts());
		return "lab01/index";
	}
}
