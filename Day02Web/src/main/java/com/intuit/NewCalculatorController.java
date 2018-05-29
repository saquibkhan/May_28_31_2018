package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewCalculatorController {

	@Autowired
	private Calculator calculator;
	
	@GetMapping("/calculator")
	public String displayCalcForm() {
		return "calc";
	}
	
	@PostMapping("/square")
	@ResponseBody
	public int square(@RequestParam int number) {
		return calculator.square(number);
	}
}





