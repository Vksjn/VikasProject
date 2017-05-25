package com.niit.PerfectShop.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Cart {
     @Id
	private int cartId;
	private String email;
	private String name;
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	private long price;
	
	private String dateAdded;
	private String status;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	
	public String getDateAdded() {
		return dateAdded;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
