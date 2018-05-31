package com.intuit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonsController {

	@Autowired
	private PersonRepository personRepository;
	
	
	@GetMapping("/person/{id}")
	public List<Person> queryPersonsById(@PathVariable int id){
		return personRepository.findById(id);
	}
	
	@PostMapping("/person/delete/{id}")
	public String deletePerson(@PathVariable int id) {
		personRepository.deleteById(id);
		return "Done";
	}
	
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




