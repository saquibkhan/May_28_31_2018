package com.intuit.lab01;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

	@GetMapping("/game")
	public String index(HttpSession session) {
		if(session.getAttribute("game") == null)
			session.setAttribute("game", new GuessingGame());
		return "lab01/index";
	}
	
	@PostMapping("/play")
	public String playGame(@RequestParam int guess,HttpSession session,Model model) {
		GuessingGame game = (GuessingGame)session.getAttribute("game");
		game.play(guess);
		model.addAttribute("message",game.getMessage());
		model.addAttribute("attempts","Attempts: " + game.getAttempts());
		return "lab01/index";
	}
}
