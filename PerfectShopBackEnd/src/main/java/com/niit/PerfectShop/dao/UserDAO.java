package com.niit.PerfectShop.dao;

import java.util.List;

import com.niit.PerfectShop.domain.User;

public interface UserDAO {

	public boolean save(User user);
	public boolean update(User user);
	public boolean validate(String id, String password);
	public List<User> lists();
	public User get (String id);
	
	
}
