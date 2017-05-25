package com.niit.PerfectShop.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.niit.PerfectShop.domain.Product;


@Component
public interface ProductDAO {
	public boolean save(Product product);
	public boolean updated(Product product);
	public boolean deleted(Product product);
	public List<Product> listss();
	public Product get(String id);
	public List<Product> getAllProductByCategory(String category_id);
}
