package com.intuit;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {	

	@GetMapping("/subtract/{a}/{b}")
	public MathResult subtract(@PathVariable int a,@PathVariable int b) {
		MathResult mathResult = new MathResult();
		mathResult.setOperation("Subtraction");
		mathResult.setNumbers(Arrays.asList(a,b));
		mathResult.setOutput(a-b);
		return mathResult;
	}
	
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a + b;
	}
}
