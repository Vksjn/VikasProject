

package com.niit.PerfectShop.dao;

import java.util.List;

import com.niit.PerfectShop.domain.Category;
import com.niit.PerfectShop.domain.User;

public interface CategoryDAO {
	public boolean save(Category category);
	public boolean update(Category category);
	public boolean delete(Category category);
	public List<Category> lists();
	public Category get (String id);
	

}
