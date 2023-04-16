package com.Masai.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Masai.BlogApplication.model.Blog;
import com.Masai.BlogApplication.model.User;

@Repository
public interface BlogDao extends JpaRepository<Blog, Integer>{

}
