package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface UpdateRepository extends JpaRepository<Login,Integer> {

	@Modifying
	@Query("update Login l set l.password = :pwd where l.loginid = :id")
	public int updatePassword(int id, String pwd);
	
	
	@Modifying
	@Query("update Login l set l.emailid = :email where l.loginid = :id")
	public int updateEmail(int id, String email);
	
	@Modifying
	@Query("update Login l set l.firstname = :fname where l.loginid = :id")
	public int updateFirstname(int id, String fname);
	
	
	@Modifying
	@Query("update Login l set l.lastname = :lname where l.loginid = :id")
	public int updateLaststname(int id, String lname);
	
	
	
	@Modifying
	@Query("update Login l set l.contactno = :contact where l.loginid = :id")
	public int updateContactNo(int id, String contact);
	
	@Modifying
	@Query("update Login l set l.address = :add where l.loginid = :id")
	public int updateAddress(int id, String add);
	
	
}
