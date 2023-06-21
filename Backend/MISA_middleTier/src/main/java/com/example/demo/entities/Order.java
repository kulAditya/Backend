package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="order")
public class Order {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int orderid;
		
		@OneToOne
		@JoinColumn(name="loginid")
		Login loginid;
		
	
		
		
		@OneToOne
		@JoinColumn(name="pid")
		Product products;
		

		public Order( Login loginid, Product product, Product products)
		{
			super();
			
			this.loginid = loginid;
		
			this.products = products;
		}

		public Product getProducts() {
			return products;
		}

		public void setProducts(Product products) {
			this.products = products;
		}

		

		public Order(Login loginid, Product products) {
			super();
			this.loginid = loginid;
			this.products = products;
		}

		public int getOrderid() {
			return orderid;
		}

		public void setOrderid(int orderid) {
			this.orderid = orderid;
		}

		public Login getLoginid() {
			return loginid;
		}

		public void setLoginid(Login loginid) {
			this.loginid = loginid;
		}

		

		
		
		
		
		
		
}
