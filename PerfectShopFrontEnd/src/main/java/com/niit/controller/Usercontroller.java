
package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PerfectShop.dao.RegistrationDao;
import com.niit.PerfectShop.dao.UserDAO;
import com.niit.PerfectShop.domain.Registration;
import com.niit.PerfectShop.domain.User;

@Controller
public class Usercontroller {
	
@Autowired RegistrationDao registrationDao;
@Autowired Registration registration;

@RequestMapping("/validate")
public ModelAndView login(@RequestParam("userEmail")String email,@RequestParam("password")String password)
{
	
	ModelAndView mv=new ModelAndView("/Home");
	if(registrationDao.validate(email, password)==true)
	{
		registration=registrationDao.get(email);
		
		mv.addObject("message", registration.getFirstname());
		if(registration.getRole().equals("admin"))
		{
			
			mv.addObject("isAdmin",true);
		}
		else
		{
			
			mv.addObject("isAdmin",false);
		}
	}
	else
	{
		
		mv.addObject("message", "Invalid User ID");
	}
	return mv;
}
}

