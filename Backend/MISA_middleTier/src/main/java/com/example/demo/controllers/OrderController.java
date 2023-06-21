package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderController {

	@Autowired
	OrderService oserv;
	
	
	@Autowired
	LoginService lserv;
	
	
	@Autowired
	ProductService pserv;
	
	@GetMapping("/getorder")
	public Order getOrder(@RequestParam("orderid") int orderid)
	{
		
		System.out.println(orderid);
		return oserv.getOrder(orderid);
	}
	

	@PostMapping("/saveorder")
	public Order SaveOrder(@RequestParam("loginid") int loginid)
	{
		
		System.out.println(loginid);
		
		return oserv.saveOrder(loginid);
	}
	
}
