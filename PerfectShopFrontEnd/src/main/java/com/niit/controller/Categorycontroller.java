package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PerfectShop.dao.CategoryDAO;
import com.niit.PerfectShop.domain.Category;

@Controller
public class Categorycontroller {
	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	Category category;

	@RequestMapping("/manage_category_add")
	public ModelAndView createCategory(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("description") String discription) {
		category.setId(id);
		category.setName(name);

		category.setDiscription(discription);
		
		
		ModelAndView mv = new ModelAndView("redirect:/Category");
		mv.addObject("isAdminClickedCategories", true);
		mv.addObject("isAdmin", true);
		if (categoryDAO.get(id) != null) {
			mv.addObject("errorMessage", "Category already exist");
			return mv;
		} else {
			categoryDAO.save(category);
		}
		return mv;

	}

	@RequestMapping("/manage_category_delete/{id}")
	public ModelAndView deleteCategory(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("redirect:/Category");
		category.setId(id);
		if (categoryDAO.delete(category)) {
			mv.addObject("deletemessage", "Successfully Delete the Ctaegory");
		} else {
			mv.addObject("deletemessage", "Not able to delete the category");
		}
		return mv;
	}

	@RequestMapping(value = "/manage_category_edit/{id}")

	public ModelAndView editCategory(@PathVariable("id") String id) {
		category = categoryDAO.get(id);
		ModelAndView mv = new ModelAndView("forward:/Category");
		mv.addObject("selectedCategory", category);
		return mv;
	}

	@RequestMapping("/manage_category_edit/manage_category_update")
	public ModelAndView updateCategory(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("discription") String discription) {
		System.out.println("Update");
		category.setId(id);
		category.setName(name);

		category.setDiscription(discription);
		ModelAndView mv = new ModelAndView("redirect:/Category");
		mv.addObject("isAdminClickedCategories", true);
		mv.addObject("isAdmin", true);
		if (categoryDAO.update(category) == true) {
			mv.addObject("updatemessage", "Successfully Update  the Category");
		} else {
			mv.addObject("updatemessage", " Not Successfully Update  the Category");
		}
		return mv;
	}

}
