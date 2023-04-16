package com.Masai.BlogApplication.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Masai.BlogApplication.exception.LoginException;
import com.Masai.BlogApplication.exception.UserException;
import com.Masai.BlogApplication.model.CurrentUser;
import com.Masai.BlogApplication.model.LoginDTO;
import com.Masai.BlogApplication.model.User;
import com.Masai.BlogApplication.repository.LoginUserSessionDao;
import com.Masai.BlogApplication.repository.UserDao;

import net.bytebuddy.utility.RandomString;


@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	  UserDao udao;
	  
	@Autowired
	 LoginUserSessionDao logindao;
	 
	 
	@Override
    public User registorUser(User user) throws UserException {
		
		  System.out.println("user   "+user);
		 User usr=udao.save(user);
		 if(usr==null) throw new UserException(" User is not Exist..  ");
		 return usr;
	
		
		
		
	}

	@Override
	public String  loginUser(LoginDTO loginDto) throws LoginException, UserException {
		
		   String s="Logain failed";   
		  User users=  udao.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
		
		 if(users==null) throw new UserException("NO User found with given emailId and Password");
		
		 
		 
		 
		 RandomString rs= new RandomString();
		 String key =rs.make(6);
		 
		 CurrentUser newCu=new CurrentUser(users.getUserId(),key,LocalDateTime.now());
		
		   if(newCu!=null)  s="Logain Success ";   
		 
		 
		 
		 return s;
		
		
	}

}
