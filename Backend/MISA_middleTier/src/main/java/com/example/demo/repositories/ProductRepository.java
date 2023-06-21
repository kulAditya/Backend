package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.Product;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface ProductRepository extends JpaRepository  < Product, Integer> {
	
//	@Query("select p from  Product p where pid=:p")
//	public Product saveProduct(Product p);


	@Modifying
	@Query("update Product set image=:file where pid=:id")
	public int uploadimage(int id,byte[]file);
	
	
	@Query("select p from  Product p where pid=:pr")
	public Product getProduct(Login pr);

	@Query("select p from  Product p  where loginid=:l  ")
	public List<Product> getByLogin(Login l);
	
	
	@Query("SELECT l.loginid FROM Login l WHERE l.emailid = :emailid AND l.password = :password")
	public int getLoginIdByEmailAndPassword( String emailid,  String password);

	

	
}
