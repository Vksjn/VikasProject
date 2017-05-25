/*package com.niit.PerfectShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PerfectShop.dao.RegistrationDao;
import com.niit.PerfectShop.domain.Registration;

public class TestRegistration {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.PerfectShop");
		
		context.refresh();
		
		Registration registration=(Registration)context.getBean("registration");
		RegistrationDao doa =(RegistrationDao)context.getBean("registrationDao");
		
		registration.setEmail("ram");
		doa.save(registration);
		System.out.println("Instance Created");
		
		context.close();
	}
}
*/