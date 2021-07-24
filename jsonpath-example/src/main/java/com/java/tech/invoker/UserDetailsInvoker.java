package com.java.tech.invoker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.java.tech.dto.Address;
import com.java.tech.dto.PhoneNumber;
import com.java.tech.dto.UserDetails;

@Component
public class UserDetailsInvoker {
	public UserDetails getUserDetails(){
		UserDetails userinfo=new UserDetails();
	
		userinfo.setFirstName("Reddy");
		userinfo.setLastName("Venkata");
		userinfo.setAge(26);
		
		//Address class data 
		Address address=new Address();
		address.setStreetAddress("naist street");
		address.setCity("Nara");
		address.setPostalCode("516227");
		userinfo.setAddress(address);
		
		//Phone number class related data
		List<PhoneNumber> phoneNumbers=new ArrayList<>();
		PhoneNumber number=new PhoneNumber();
		number.setType("iPhone");
		number.setNumber("0123-4567-8888");
		
		PhoneNumber number1=new PhoneNumber();
		number1.setType("home");
		number1.setNumber("0123-4567-8899");
		phoneNumbers.add(number);
		phoneNumbers.add(number1);
		userinfo.setPhoneNumbers(phoneNumbers);
		
		return userinfo;
	}
	
	

}
