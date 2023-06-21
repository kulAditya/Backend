package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.UpdateRepository;

@Service
public class UpdateService {

	
	
	 @Autowired
	  LoginRepository lrepo;
	 
	 @Autowired
	  UpdateRepository uprepo;
	
	/* public int UpdatePassword(Login l,String pwd)
		{
			
			return uprepo.updatePassword(l.getLoginid(), pwd);
		}
	 
	 public int UpdateEmail(Login l,String pwd)
		{
			
			return uprepo.updateEmail(l.getLoginid(), pwd);
		}
	 
	 public int UpdateFirstname(Login l,String fname)
		{
			
			return uprepo.updateFirstname(l.getLoginid(), fname);
		}
	 
	 
	 public int UpdateLastname(Login l,String lname)
		{
			
			return uprepo.updateLaststname(l.getLoginid(), lname);
		}
	 
	 
	 public int UpdateContactNO(Login l,String lname)
		{
			
			return uprepo.updateContactNo(l.getLoginid(), lname);
		}
	 
	 
	 public int UpdateAddress(Login l,String lname)
		{
			
			return uprepo.updateAddress(l.getLoginid(), lname);
		}
	 */
}
