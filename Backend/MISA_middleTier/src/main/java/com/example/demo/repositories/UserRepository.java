package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;

@Repository
public interface UserRepository extends JpaRepository<Login, Integer> {

	@Query("select l from from Login l where loginid=:l")
	public Login getUser(Login l);
}
