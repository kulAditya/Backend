package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.entities.PassBasedEnc;
import com.example.demo.entities.User;
import com.example.demo.entities.Role;
import com.example.demo.entities.SaltValue;
import com.example.demo.entities.UserReg;
import com.example.demo.services.LoginService;
import com.example.demo.services.RoleService;
import com.example.demo.services.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserService uservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	RoleService rservice;
	
	@Autowired
	SaltValue saltValue;
	
	@GetMapping("/getUser")
	public Login getUser( @RequestParam("loginid") int loginid)
	{
		Login l=lservice.getById(loginid);
		return uservice.getUser(l);
		
	}
	@PostMapping("/regUser")
	public Login regUser(@RequestBody UserReg ur)
	{
		Role r=rservice.getRole(ur.getRole_id());
		int status = 0;
		if(ur.getRole_id() == 1)
			status = 1;
else if(ur.getRole_id() == 2)
			status = 0;
		System.out.println(saltValue.getSalt());
		String encrypted =PassBasedEnc.generateSecurePassword(ur.getPassword(), saltValue.getSalt());
		
		
		Login l=new Login(ur.getFirstname(),ur.getLastname(),ur.getEmailid(),encrypted,ur.getContactno(),ur.getAddress(),status,r);
	//	Login l=new Login(ur.getFirstname(),ur.getLastname(),ur.getEmailid(),ur.getPassword(),ur.getContactno(),ur.getAddress(),status,r);
       Login saved=lservice.save(l);
       return saved;
	}
	


}
