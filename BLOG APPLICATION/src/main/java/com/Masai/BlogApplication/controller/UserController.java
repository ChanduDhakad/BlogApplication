package com.Masai.BlogApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.BlogApplication.exception.LoginException;
import com.Masai.BlogApplication.exception.UserException;
import com.Masai.BlogApplication.model.LoginDTO;
import com.Masai.BlogApplication.model.User;
import com.Masai.BlogApplication.services.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {

	
	@Autowired
	UserService us;
	
	
	@PostMapping("/masaiblog/user/register")
public ResponseEntity<User> registorUser(@RequestBody User user) throws UserException{
		
		System.out.println("controlelr user "+user);
		
	User usr=	us.registorUser(user);
   return 	new ResponseEntity<>(user,HttpStatus.CREATED);
		
		
}
	
	
	@PostMapping("/masaiblog/user/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginDTO ld) throws UserException, LoginException{
			
			
		String usr=	us.loginUser(ld);
	   return new ResponseEntity<>(usr,HttpStatus.CREATED);
			
			
	}
	
	
	
	
}
