package com.niit.PerfectShop.dao;

import java.util.List;

import com.niit.PerfectShop.domain.Registration;


public interface RegistrationDao {
	public boolean save(Registration registration);
	public boolean update(Registration registration);
	public boolean validate(String email, String password);
	public List<Registration> lists();
	public Registration get (String email);

}
