package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonsController {

	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("/person/save")
	public String savePerson(@RequestParam("fname") String firstName,
			@RequestParam("lname") String lastName,
			@RequestParam int age) {
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAge(age);
		
		personRepository.save(person);
		return "DONE";
	}
	
}




