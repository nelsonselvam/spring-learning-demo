package com.springboot.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Greeting implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7563223784942631960L;

	public Greeting(String name, String greeting) {
		this.name = name;
		this.greeting = greeting;
	}

	@JsonProperty("name")
	String name;

	@JsonProperty("greeting")
	String greeting;

}
