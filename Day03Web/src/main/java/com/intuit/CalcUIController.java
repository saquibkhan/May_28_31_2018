package com.intuit;

import java.net.URI;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class CalcUIController {
	
	@Value("${calcservice.url}")
	private String calcServiceUrl;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/calc")
	public String index() {
		return "calcmath";
	}
	
	@PostMapping("/subtract")
	public String subtract(@RequestParam("num1") int a, @RequestParam("num1") int b,Model model) throws Exception{
		URI subtractUrl = new URI(calcServiceUrl + "/subtract/" + a + "/" + b);
		String response = restTemplate.getForObject(subtractUrl, String.class);
		model.addAttribute("result",response);
		return "calcmath";
	}
}








