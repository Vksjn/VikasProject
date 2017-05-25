package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PerfectShop.dao.RegistrationDao;
import com.niit.PerfectShop.domain.Registration;
@Controller
public class RegistrationController {
	
	@Autowired RegistrationDao registrationDAO;
	@Autowired Registration registration;
	@RequestMapping("/RegistrationForm")

	public ModelAndView create(@RequestParam ("FirstName") String firstname,@RequestParam ("LastName") String lastname,@RequestParam ("Address") String address, @RequestParam ("City") String city,
			@RequestParam ("State") String state,@RequestParam ("Zip") int zip, @RequestParam ("Password") String password,@RequestParam ("Repassword") String repassword, @RequestParam ("Phone") long phone,
			@RequestParam ("Email") String email,  @RequestParam("role") String role)
	{
		ModelAndView mv=new ModelAndView("Home");
		registration.setFirstname(firstname);
		registration.setLastname(lastname);
		registration.setAddress(address);
		registration.setCity(city);
		registration.setState(state);
		registration.setZip(zip);
		registration.setPassword(password);
		registration.setRepassword(repassword);
		registration.setPhone(phone);
		registration.setEmail(email);
		
		registration.setRole(role);
			
	 boolean flag= registrationDAO.save(registration);
		if(flag==true)
		{
			
			mv.addObject("RegistrationSave", "Data Save Successfully");
		
		}
		else
		{
			mv.addObject("RegistrationSave", "Data Not Save");
		}
		return mv;
	}
}


