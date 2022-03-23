package com.learn4u.microservice1;

import org.springframework.stereotype.Component;

@Component
public class PolicyBean {

	private String message;
	private long id;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	
}
