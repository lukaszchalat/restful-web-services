package de.lukaszchalat.rest.webservices.restfulwebservices.model;

public class AuthenticationBean {
	
	public String message;
	
	public AuthenticationBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
}
