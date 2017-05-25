/*package com.niit.PerfectShop;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PerfectShop.dao.SupplierDAO;
import com.niit.PerfectShop.domain.Supplier;



public class SupplierDAOTestCase {
	@Autowired static AnnotationConfigApplicationContext context;
	@Autowired static SupplierDAO supplierDAO;
	@Autowired static Supplier supplier;
	@BeforeClass
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.PerfectShop");
		context.refresh();
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		supplier=(Supplier)context.getBean("supplier");
	}
//@Test
	public void testCreateSupplierTestCase()
	{
		supplier.setId("145");
		supplier.setName("Shobhit Singh");
		supplier.setAddress("Delhi");
		
		boolean flag=supplierDAO.save(supplier);
		assertEquals("createSupplierTestCase",true,flag);
	}
//@Test
	public void updateSupplierTestCase()
	{
		
		supplier.setAddress("Mumbai");
		boolean flag=supplierDAO.updates(supplier);
		assertEquals("updateSupplierTestCase",true,flag);
	}
	//@Test
	public void deleteSupplierTestCase()
	{
		
		supplier.setAddress("B103");
		boolean flag=supplierDAO.deletes(supplier);
		assertEquals("deleteSupplierTestCase",true,flag);
	}
	@Test
	public void getAllsupplierTestCase()
	{
	int actSize=supplierDAO.list().size();
	assertEquals(1,actSize);
	}
}
*/