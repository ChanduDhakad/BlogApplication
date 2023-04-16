package com.Masai.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Masai.BlogApplication.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

User findByEmailAndPassword(String email,String pwd);
	
}
