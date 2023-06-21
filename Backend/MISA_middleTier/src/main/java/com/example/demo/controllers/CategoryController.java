package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Category;
import com.example.demo.services.CategoryService;

public class CategoryController {

	@Autowired
	CategoryService cservice;
	
	
	
	@GetMapping("/saveproduct")
	public Category getCategory(@RequestParam("cid") int cid)
	{
		return cservice.getCategory(cid);
	}
	
	
	
	
	
	
}
