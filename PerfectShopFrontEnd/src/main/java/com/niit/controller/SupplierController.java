package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PerfectShop.dao.SupplierDAO;
import com.niit.PerfectShop.domain.Supplier;;

@Controller
public class SupplierController {

	@Autowired
	SupplierDAO supplierDAO;
	@Autowired
	Supplier supplier;

	@RequestMapping("/manage_supplier_add")
	public ModelAndView addSupplier(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("address") String address) {
		System.out.println("adding supplier");
		supplier.setId(id);
		supplier.setName(name);
		supplier.setAddress(address);
		ModelAndView mv = new ModelAndView("redirect:/Supplier");
		mv.addObject("isAdminClickedSuppliers", true);
		mv.addObject("isAdmin", true);
	  // Supplier status=supplierDAO.get(id);
		//if ( status.getId() != null) {
			//mv.addObject("supplieraddmessage", "Supplier already exist");
			//return mv;
		//} else {
			supplierDAO.save(supplier);
		//}
		return mv;
	}
	@RequestMapping("/manage_supplier_delete/{id}")
	public ModelAndView deleteSupplier(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("redirect:/Supplier");
		supplier.setId(id);
		if (supplierDAO.deletes(supplier)) {
			mv.addObject("deleteSupplierMessage", "Successfully Delete the Supplier");
		} else {
			mv.addObject("deleteSupplierMessage", "Not able to delete the Supplier");
		}
		return mv;
	}

	@RequestMapping(value = "/manage_supplier_edit/{id}")

	public ModelAndView editSupplier(@PathVariable("id") String id) {
		supplier = supplierDAO.get(id);
		ModelAndView mv = new ModelAndView("forward:/Supplier");
		mv.addObject("selectedSupplier", supplier);
		return mv;
	}

	@RequestMapping("/manage_supplier_edit/manage_supplier_update")
	public ModelAndView updateSupplier(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("address") String address) {
		System.out.println("Update");
		supplier.setId(id);
		supplier.setName(name);

		supplier.setAddress(address);
		ModelAndView mv = new ModelAndView("redirect:/Supplier");
		mv.addObject("isAdminClickedSuppliers", true);
		mv.addObject("isAdmin", true);
		if (supplierDAO.updates(supplier) == true) {
			mv.addObject("updatemessage", "Successfully Update  the Supplier");
		} else {
			mv.addObject("updatemessage", " Not Successfully Update  the Supplier");
		}
		return mv;
	}

}
