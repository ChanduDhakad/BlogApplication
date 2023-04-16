package com.Masai.BlogApplication.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class LoginException extends Exception{

	public LoginException() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginException(String message) {
	
	 super(message);
	}
	
	
}
