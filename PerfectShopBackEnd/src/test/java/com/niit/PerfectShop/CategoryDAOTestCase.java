/*package com.niit.PerfectShop;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PerfectShop.dao.CategoryDAO;
import com.niit.PerfectShop.domain.Category;

public class CategoryDAOTestCase {

	@Autowired static AnnotationConfigApplicationContext context;
	@Autowired static CategoryDAO categoryDAO;
	@Autowired static Category category;
	@BeforeClass
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.PerfectShop");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		category=(Category)context.getBean("category");
	}
	@Test
	public void testCreateUserTestCase()
	{
	category.setId("A124");
	category.setName("Baby&Kids");
	category.setDiscription("xya");
	boolean flag=categoryDAO.save(category);
	assertEquals("createUserTestCase", true,flag);
	}
	//@Test
	public void testUpdateUserTestCase()
	{
	
	category.setDiscription("Shoes");
	boolean flag=categoryDAO.update(category);
	assertEquals("updateUserTestCase", true,flag);
	}
	//@Test
	public void testDeleteUserTestCase()
	{
	
	category.setId("A101");
	boolean flag=categoryDAO.delete(category);
	assertEquals("updateUserTestCase", true,flag);
	}
	//@Test
	public void testGetAllUserTestCase()
	{
	int actSize=categoryDAO.lists().size();
	assertEquals(1,actSize);
	}
}
*/