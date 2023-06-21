package com.example.demo.entities;

import java.util.*;


import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
			
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int cid;
	
	@Column
	String cname;

	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Category(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public Category() {
		super();
		
	}
}
