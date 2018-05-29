package com.intuit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/register")
	@ResponseBody
	//http://localhost:8080/register?name=Virat
	public String register(@RequestParam("name") String name) {
		return "Registered " + name;
	}
	
	@PostMapping("/bye/{name}")
	@ResponseBody
	public String bye(@PathVariable String name) {
		return "Bye " + name;
	}
	
	@GetMapping("/hi/{name}")
	@ResponseBody
	public String greet(@PathVariable("name")String name) {
		return "Hi " + name;
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}
}
