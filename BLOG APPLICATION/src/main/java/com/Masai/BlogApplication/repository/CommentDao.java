package com.Masai.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Masai.BlogApplication.model.Comment;
import com.Masai.BlogApplication.model.User;

@Repository
public interface CommentDao extends JpaRepository<Comment, Integer>{

}
