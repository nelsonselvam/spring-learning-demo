package com.springboot.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonPropertyOrder({"message","greetNick"})
public class DemoResponse extends ServiceResponse {
	
	@JsonProperty("greetNick")
	Greeting greeting;
	

}
