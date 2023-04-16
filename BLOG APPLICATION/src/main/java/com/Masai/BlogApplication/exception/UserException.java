package com.Masai.BlogApplication.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class UserException extends Exception{

	public UserException() {
		// TODO Auto-generated constructor stub
	}
	
	public UserException(String message) {
	
	 super(message);
	}
	
	
}
