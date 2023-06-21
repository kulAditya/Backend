package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.repositories.ApproveRepository;

@Service
public class ApproveService {
	@Autowired
	ApproveRepository arepo;
	
	
	
	public Login getSeller(int loginid)
	{
		return arepo.findById(loginid).get();
	}
	
	public List<Login> getAllSeller()
	{
		return arepo.getSeller();
	}
	
	public int  setStatusZero(int loginid)
	{
		
		return arepo.setStatusZero( loginid);
	}
	
	
	public int setStatusOne(int loginid)
	{
		System.out.println(loginid);
		return arepo.setStatusOne( loginid);
	}
	
	
	
}
