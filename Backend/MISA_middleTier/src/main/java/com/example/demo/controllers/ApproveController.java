package com.example.demo.controllers;

import java.util.List;


import com.example.demo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.entities.Role;
import com.example.demo.services.ApproveService;
import com.example.demo.services.LoginService;
import com.example.demo.services.RoleService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ApproveController {

	@Autowired
	ApproveService aserv;
	
	@Autowired
	LoginService lservice;

	@Autowired
	RoleService rservice;
	
	@GetMapping("/getseller")
	public Login getSeller(@RequestParam("loginid")int  loginid)
	{
		Login l= lservice.getById(loginid);
		
		return aserv.getSeller(loginid);
	}
	
	
	@GetMapping("/getallseller")
	public List<Login> getAllSeller()
	{
		return aserv.getAllSeller();
	}
	
	@GetMapping("/setStatusZero")
	public void deactivateOperator(@RequestParam("loginid") int loginid)
	{
		
		System.out.println(loginid);
		aserv.setStatusZero(loginid);
		
	}

	@GetMapping("/setStatusOne")
	public void activateOperator(@RequestParam("loginid") int loginid)
	{
		
		System.out.println(loginid);
		aserv.setStatusOne(loginid);
	}
	
	


	
}
