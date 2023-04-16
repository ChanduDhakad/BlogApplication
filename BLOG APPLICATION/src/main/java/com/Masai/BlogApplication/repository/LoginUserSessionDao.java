package com.Masai.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Masai.BlogApplication.model.CurrentUser;

public interface LoginUserSessionDao extends JpaRepository<CurrentUser,Integer>{

	
	
	
}
