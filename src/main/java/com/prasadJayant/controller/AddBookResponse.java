package com.prasadJayant.controller;

import org.springframework.stereotype.Component;
@Component
public class AddBookResponse {
	
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;

}
