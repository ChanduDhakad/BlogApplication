package com.Masai.BlogApplication.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class CommentException extends Exception{

	public CommentException() {
		// TODO Auto-generated constructor stub
	}
	
	public CommentException(String message) {
	
	 super(message);
	}
	
	
}
