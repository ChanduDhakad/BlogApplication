package com.Masai.BlogApplication.exception;

import java.time.LocalDateTime;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.Masai.BlogApplication.model.Comment;


@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException me) {
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),"Validation Error",me.getBindingResult().getFieldError().getDefaultMessage());
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> UserExceptionHandler(UserException user,WebRequest req){
		
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),user.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BlogException.class)
	public ResponseEntity<MyErrorDetails> RouteExceptionHandler(BlogException route,WebRequest req){
		
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),route.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	
	@ExceptionHandler(CommentException.class)
	public ResponseEntity<MyErrorDetails> myAdminExceptionHandler(CommentException  ae,WebRequest req){
		
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ae.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
		
	}


	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<MyErrorDetails> myAdminExceptionHandler(HttpRequestMethodNotSupportedException ue,WebRequest req){
		
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ue.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	
		
	}
	
	
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorDetails> myAdminExceptionHandler(LoginException le,WebRequest req){
		
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),le.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<MyErrorDetails> myAdminExceptionHandler(ConstraintViolationException le,WebRequest req){
		
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),le.getMessage(),req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
