package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;

import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService
{
   
	@Autowired
	CategoryRepository crepo;
	
	
	public Category getCategory(int cid )
	{
		return crepo.findById(cid).get();
	}
	
	
	
}
