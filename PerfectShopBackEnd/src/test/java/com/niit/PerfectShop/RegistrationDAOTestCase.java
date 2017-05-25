/*package com.niit.PerfectShop;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PerfectShop.dao.RegistrationDao;

import com.niit.PerfectShop.domain.Registration;


public class RegistrationDAOTestCase {

	@Autowired static AnnotationConfigApplicationContext context;
	@Autowired static RegistrationDao registrationDao;
	@Autowired static Registration registration;
	@BeforeClass
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.PerfectShop");
		context.refresh();
		registrationDao=(RegistrationDao)context.getBean("registrationDao");
		registration=(Registration)context.getBean("registration");
	}
	@Test
	public void testcreateRegistrationTestCase()
	{ 
		registration.setEmail("rahul@gmail.com");
		registration.setFirstname("rahul");	
		registration.setLastname("Jain");
		registration.setAddress("delhi");
		registration.setCity("delhi");
		registration.setState("delhi");
		registration.setZip(110032);
		registration.setPassword("rahul");
		registration.setRepassword("rahul");
		registration.setPhone(955566);
		
		
	boolean flag=registrationDao.save(registration);
	assertEquals("createRegistrationTestCase", true,flag);
	
	
	
	
	}
	@Test
	public void testvalidateUserTestCase()
	{
	boolean flag=registrationDao.validate("rahul@gmail.com", "rahul");
	assertEquals(true,flag);
	}
	
}
*/