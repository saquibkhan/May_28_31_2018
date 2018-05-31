package com.intuit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	public void testGreet() {
		String output = testRestTemplate.getForObject("/greet/Sam", String.class);
		assertEquals("Hello Sam",output);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
