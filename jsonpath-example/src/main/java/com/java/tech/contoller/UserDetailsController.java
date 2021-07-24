package com.java.tech.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.java.tech.service.UserDetailsService;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	private static final Object Object = null;
	@Autowired
	private UserDetailsService service;

	@GetMapping("/hello")
	public String getInfo()  {
		
		return  "Hello world";
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getPhoneNumbers")
	public List<String> getPhonenumberNames() throws JsonProcessingException {
		System.out.println("Hello world");
		String expression = "$.phoneNumbers[*].number";
		return (List<String>) service.getFormatedResponse(expression, List.class);
	}

	@GetMapping("/getCity")
	public String getCitys() throws JsonProcessingException {
		String city = "$.address.city";
		return  (String) service.getFormatedResponse(city, Object.class);
	}
	@GetMapping("/get")
	public String getFirstName() throws JsonProcessingException {
		String firstName = "$.firstName";
		return  (String) service.getFormatedResponse(firstName, Object.class);
	}

	/*public List<Object> getCountries() throws JsonProcessingException {
	 * public List<Country> getCountries() throws JsonProcessingException 
		// String expression1 = "$.Countries[*]";
		String expression2 = "$.Countries[*].Data";
		//return (List<Country>) service.getFormatedResponse(expression1, List.class);
		return (List<Object>) service.getFormatedResponse(expression2, List.class);
	}
	*/
}