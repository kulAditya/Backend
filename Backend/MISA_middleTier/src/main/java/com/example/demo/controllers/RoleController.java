package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.services.RoleService;

@RestController
public class RoleController {

	@Autowired
	RoleService rserv;
	
	@PostMapping("/saverole")
	public int saveRole(@RequestParam("role_name") String name)
	{
	Role r=	rserv.saverole(name);
		return r.getRole_id();
	}
}
