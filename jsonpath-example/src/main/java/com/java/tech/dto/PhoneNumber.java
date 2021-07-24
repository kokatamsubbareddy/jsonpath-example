
package com.java.tech.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "number"
})

public class PhoneNumber {

    public PhoneNumber(String type, String number) {
		super();
		this.type = type;
		this.number = number;
	}

	@JsonProperty("type")
    private String type;
    @JsonProperty("number")
    private String number;
    
    
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}
