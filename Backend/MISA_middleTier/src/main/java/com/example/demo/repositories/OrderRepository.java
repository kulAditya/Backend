package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.Order;
import com.example.demo.entities.Product;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface OrderRepository extends JpaRepository <Order,Integer> {
	
	
	
	
	
	
	
}
