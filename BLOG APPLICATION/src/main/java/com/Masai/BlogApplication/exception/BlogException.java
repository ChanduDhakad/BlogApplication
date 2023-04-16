package com.Masai.BlogApplication.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class BlogException extends Exception{

	public BlogException() {
		// TODO Auto-generated constructor stub
	}
	
	public BlogException(String message) {
	
	 super(message);
	}
	
	
}
