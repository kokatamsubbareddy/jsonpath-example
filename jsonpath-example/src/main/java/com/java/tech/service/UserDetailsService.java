package com.java.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.tech.dto.UserDetails;
import com.java.tech.invoker.UserDetailsInvoker;
import com.jayway.jsonpath.JsonPath;

@Service
public class UserDetailsService {

		@Autowired
		private UserDetailsInvoker invoker;

		ObjectMapper mapper = new ObjectMapper();

		public Object getFormatedResponse(String jsonExpression, Class<?> classType) throws JsonProcessingException {
			UserDetails response = invoker.getUserDetails();
			String jsonResponse = mapper.writeValueAsString(response);
			Object countryResponse = JsonPath.parse(jsonResponse).read(jsonExpression, classType);
			return countryResponse;
		}

	}
	
