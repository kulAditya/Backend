package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.services.LoginService;
import com.example.demo.services.UpdateService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UpdateProfController {

	
	@Autowired
	LoginService lservice;
	
	@Autowired
	UpdateService upserv;
	
	/*
	
	@PostMapping("/updatepassword")
	public int UpdatePwd(@RequestParam("emailid")String emailid,@RequestParam("pwd")String pwd,@RequestParam("newpassword")String newpassword)
	{
		Login l= lservice.getLogin(emailid,pwd);
		
		int loginid=l.getLoginid();
		System.out.println(lservice.UpdatePassword(l,newpassword));
		
		lservice.UpdatePassword(l,newpassword);
		
		return loginid;
	}
	
	
	@PostMapping("/updateemailid")
	public int UpdateEmail(@RequestParam("emailid")String emailid,@RequestParam("password")String pwd,@RequestParam("emailid")String newemailid)
	{
		Login l= lservice.getLogin(emailid,newemailid);
		
		int loginid=l.getLoginid();
		System.out.println(upserv.UpdateEmail(l,newemailid));
		
		upserv.UpdateEmail(l,newemailid);
		
		return loginid;
	}
	
	
	
	@PostMapping("/updatefname")
	public int UpdateFirstname(@RequestParam("emailid")String emailid,@RequestParam("pwd")String pwd,@RequestParam("firstname")String newfname)
	{
		Login l= lservice.getLogin(emailid,newfname);
		
		int loginid=l.getLoginid();
		System.out.println(upserv.UpdateFirstname(l,newfname));
		
		upserv.UpdateFirstname(l,newfname);
		
		return loginid;
	}
	*/
	
}
