package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Category;
import com.example.demo.entities.Login;
import com.example.demo.entities.Order;
import com.example.demo.entities.Product;
import com.example.demo.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orepo;
	
	@Autowired
	LoginService lserv;
	
	@Autowired
	ProductService pserv;
	
	public Order getOrder(int id)
	{
		
		
		System.out.println("this is order"+ orepo.findById(id).get());
		return orepo.findById(id).get();
	}
	
	
	public Order saveOrder(int loginid)
	{
		Login l=lserv.getById(loginid);
		Product p=pserv.getProduct(l);
		System.out.println(p.getProductname());
		Order o=new Order(l,p);
		System.out.println(loginid);
		orepo.save(o);
		return o;
	}
	
}
