package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.niit.PerfectShop.dao.CategoryDAO;
import com.niit.PerfectShop.domain.Category;



@Controller
public class Homecontroller {
	@Autowired 	HttpSession session;
	@Autowired 	Category category;
	@Autowired 	CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/Home"})
	public ModelAndView gotoHome()
	{
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("messagess"," Visiting");
		List<Category> categoryList=categoryDAO.lists();
		session.setAttribute("categoryList", categoryList);
		session.setAttribute("category", category);
		return mv;
	}
	
	
	
	
	@RequestMapping("/Login")
	public String loginpage(Model model)
	{
		model.addAttribute("isUserClickLogin", true);
		return "Home";
	}
	
	@RequestMapping("/Registration")
	public String Registrationpage(Model model)
	{
		model.addAttribute("isUserClickRegistration", true);
		
		System.out.println("User click Registration Link");
		
		return "Home";
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout()
	{
	ModelAndView mv=new ModelAndView("/Home");
	session.removeAttribute("message");
	return mv;
	}
	
	
}
