package com.intuit;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
	
	@Resource(name="hobbies")
	private List<String> hobbies;
	
	@PostMapping("/process")
	public String greet(@RequestParam String name, Model model,HttpSession session) {
		String message = "Hello " + name;
		model.addAttribute("message",message);
		session.setAttribute("time", new Date());
		return "result";
	}
	
	@GetMapping("/")
	public String index() {
		hobbies.forEach(hobby -> System.out.println(hobby));
		return "form";
	}
}
