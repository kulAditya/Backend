package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;

import jakarta.transaction.Transactional;


@Transactional
@Repository
public interface ApproveRepository extends JpaRepository <Login,Integer> {
		
	
	@Query("select l from Login l where role_id=2 ")
	public List<Login> getSeller();
	
	
	@Modifying
	@Query("update Login l set l.status = 1 where l.loginid = :logid")
	public int setStatusOne(int logid);
	
	
	@Modifying
	@Query("update Login l set l.status = 0 where l.loginid = :lognid")
	public int setStatusZero(int lognid);
	
	
	
}
