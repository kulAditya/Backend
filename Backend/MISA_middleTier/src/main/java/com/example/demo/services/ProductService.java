package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository prorepo;
	
	
	
	public Product saveProduct(Product p)
	{
		
		return prorepo.save(p);
	}
	
	
		public Product getProduct(Login l)
		{
			return prorepo.getProduct(l);
		}

	
	public boolean UploadImage(int pid, byte [] photo)
	{
		if(prorepo.uploadimage(pid, photo)== 1)
		return true;
		else
			return false;
	}


	public List<Product> getAllProducts() {
	
		return prorepo.findAll();
	}
	
	
	public void RemoveProduct(int pid)
	{
		 prorepo.deleteById(pid);;
	}
	
	
	
	public List<Product>  getByLogin(Login l)
	{
		return prorepo.getByLogin(l);
	}
	
	
	public int getLoginidBylogin(String emailid,  String password)
	{
		return prorepo.getLoginIdByEmailAndPassword(emailid,password);
	}
	

}
