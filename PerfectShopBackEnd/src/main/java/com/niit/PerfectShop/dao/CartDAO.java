package com.niit.PerfectShop.dao;


import java.util.List;

import org.springframework.stereotype.Component;

import com.niit.PerfectShop.domain.Cart;

@Component
public interface CartDAO {

	public boolean addToCart(Cart cart);
	public boolean updateCart(Cart cart);
	public List<Cart> listCart(String email);
	public long getTotalAmount(String email);
}
