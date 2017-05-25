package com.niit.PerfectShop.dao;

import java.util.List;

import com.niit.PerfectShop.domain.Supplier;



public interface SupplierDAO {

	public boolean save(Supplier supplier); 
	public boolean updates(Supplier supplier);
	public boolean deletes(Supplier supplier);
	public List<Supplier> list();
	public Supplier get(String id);
}
