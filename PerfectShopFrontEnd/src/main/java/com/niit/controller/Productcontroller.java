package com.niit.controller;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PerfectShop.dao.CategoryDAO;
import com.niit.PerfectShop.dao.ProductDAO;
import com.niit.PerfectShop.dao.SupplierDAO;
import com.niit.PerfectShop.domain.Category;
import com.niit.PerfectShop.domain.Product;
import com.niit.PerfectShop.domain.Supplier;

@Controller
public class Productcontroller {
	@Autowired
	ProductDAO productDAO;
	@Autowired
	Product product;
	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	Category category;
	@Autowired
	SupplierDAO supplierDAO;
	@Autowired
	Supplier supplier;
	Path path;

	@PostMapping("/manage_Product_add")
	public ModelAndView createCategory(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("discription") String discription, @RequestParam("price") String price,@RequestParam("category.id")
			String category_id, @RequestParam("supplier.id") String supplier_id, @RequestParam("image") MultipartFile image,HttpServletRequest request) {
		System.out.println("adding product");
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		product.setDiscription(discription);
		product.setCategory_id(category.getId());
		product.setSupplier_id(supplier.getId());
	
		ModelAndView mv = new ModelAndView("redirect:/Product");
		mv.addObject("isAdminClickedProducts", true);
		mv.addObject("isAdmin", true);
		//if (productDAO.get(id) != null) {
			//mv.addObject("errorMessage", "Product already exist");
			//return mv;
		//} else {
		
			productDAO.save(product);
		//}
			   String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		       path = Paths.get(rootDirectory + "/resources/product/images/" + product.getId() + ".png");
		        System.out.println("00000"+path);
		       if(image != null && !image.isEmpty()){
		           try {
		               image.transferTo(new File(path.toString()));
		           } catch (Exception ex){
		               ex.printStackTrace();
		               throw new RuntimeException("Product image saving failed", ex);
		           }
		       }
		       return mv;

	}
}
