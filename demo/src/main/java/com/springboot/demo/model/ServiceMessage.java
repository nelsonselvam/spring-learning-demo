package com.springboot.demo.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter; 
import lombok.experimental.FieldDefaults;


public class ServiceMessage {
	
	String type;
	
	String code;
	
	String description;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
