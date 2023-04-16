package com.Masai.BlogApplication.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer blogId;
	
	private category category;
	private String content;
	
	private LocalDateTime timeStamp;
	
	@ManyToOne
    User user;
	
	@OneToMany
    List<Comment> comments=new ArrayList<>();
	
}
