package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	
	@Column
	String productname,video;
	
	byte[]image;
	
	@Column
	float price;
	
	
	@JsonIgnoreProperties("products")
	@OneToOne
	@JoinColumn(name="cid")
	Category category;

	
	@OneToOne
	@JoinColumn(name="loginid")
	Login loginid;
	
	public Login getLoginid() {
		return loginid;
	}



	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}



	public Product() {
		super();
		
	}



	public Product( String productname, String video, float price, Category category,Login loginid) {
		super();
		this.loginid=loginid;
		this.productname = productname;
		this.video = video;
		
		this.price = price;
		this.category = category;
	}



	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public void AddAttribute(String string, List<Product> cartItem)
	{
		
		
	}



	



	
	
}
