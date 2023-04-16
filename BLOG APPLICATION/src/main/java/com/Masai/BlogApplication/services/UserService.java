package com.Masai.BlogApplication.services;

import com.Masai.BlogApplication.exception.LoginException;
import com.Masai.BlogApplication.exception.UserException;
import com.Masai.BlogApplication.model.LoginDTO;
import com.Masai.BlogApplication.model.User;

public interface UserService {

	User registorUser(User user) throws UserException;
	String  loginUser(LoginDTO loginDto) throws  LoginException, UserException;
    
	
	
	
}
						