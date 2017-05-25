package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PerfectShop.dao.CategoryDAO;
import com.niit.PerfectShop.dao.ProductDAO;
import com.niit.PerfectShop.dao.SupplierDAO;
import com.niit.PerfectShop.domain.Category;
import com.niit.PerfectShop.domain.Product;
import com.niit.PerfectShop.domain.Supplier;





@Controller
public class Admincontroller {
	@Autowired 	HttpSession session;
	@Autowired 	Category category;
	@Autowired 	CategoryDAO categoryDAO;
	@Autowired  SupplierDAO supplierDAO;
	@Autowired Supplier supplier;
	@Autowired ProductDAO productDAO;
	@Autowired Product product;
	
	
@RequestMapping("/Category")

public ModelAndView manageCategory()
{
	ModelAndView mv=new ModelAndView("/Home");
	mv.addObject("isAdminClickedCategories", true);
	mv.addObject("isAdmin",true);
		List<Category> categoryList=categoryDAO.lists();
	session.setAttribute("categoryList", categoryList);
	session.setAttribute("category", category);
	return mv;
	
}
@RequestMapping("/Supplier")
public ModelAndView manageSupplier()
{
	ModelAndView mv=new ModelAndView("/Home");
	mv.addObject("isAdminClickedSuppliers", true);
	mv.addObject("isAdmin",true);
	List<Supplier> supplerList=supplierDAO.list();
	session.setAttribute("supplerList", supplerList);
	session.setAttribute("supplier", supplier);
	
	return mv;
	
}
@RequestMapping("/Product")
public ModelAndView manageProduct(@ModelAttribute("product") Product p)
{
	ModelAndView mv=new ModelAndView("/Home");
	mv.addObject("isAdminClickedProducts", true);
	mv.addObject("isAdmin",true);
	mv.addObject("category", category);
	mv.addObject("supplier", supplier);
	List<Supplier> supplerList=supplierDAO.list();
	List<Category> categoryList=categoryDAO.lists();
	List<Product> productList=productDAO.listss();
	List<Product> productlistByCategory=productDAO.getAllProductByCategory("category_id");
	
	mv.addObject("categoryList", categoryList);
	mv.addObject("supplierList",supplerList );
	session.setAttribute("productList", productList);
	session.setAttribute("productlistByCategory", productlistByCategory);
	session.setAttribute("product", product);
	
	
	return mv;
	
}
}
