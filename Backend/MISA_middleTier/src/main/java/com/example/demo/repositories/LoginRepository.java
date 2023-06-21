package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

	@Query("select l from Login l where emailid=:uid and password=:pwd")
	public Optional<Login> getLogin(String uid,String pwd);
	
	
	@Modifying
	@Query("update Login l set l.password = :pwd where l.loginid = :id")
	public int updatePassword(int id, String pwd);
	
	@Modifying
	@Query("update Login l set l.emailid = :email where l.loginid = :id")
	public int updateEmail(int id, String email);

}