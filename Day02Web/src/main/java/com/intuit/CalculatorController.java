package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calc")
public class CalculatorController {
	
	@Autowired
	private Calculator calculator;

	@GetMapping("/square/{number}")
	@ResponseBody
	public int square(@PathVariable int number) {
		return calculator.square(number);
	}
	
	@GetMapping("/product")
	@ResponseBody
	public int multiply(@RequestParam("num1") int number1,
			@RequestParam("num2") int number2) {
		return calculator.multiply(number1, number2);
	}
	
	@GetMapping("/subtract/{number1}/{number2}")
	@ResponseBody
	public int subtract(@PathVariable int number1,
			@PathVariable int number2) {
		return calculator.subtract(number1, number2);
	}
	@GetMapping("/add/{number1}/{number2}")
	@ResponseBody
	public int add(@PathVariable int number1,
			@PathVariable int number2) {
		return calculator.add(number1, number2);
	}
}
