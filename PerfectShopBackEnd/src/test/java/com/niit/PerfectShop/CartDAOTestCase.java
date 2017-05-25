/*package com.niit.PerfectShop;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PerfectShop.dao.CartDAO;
import com.niit.PerfectShop.domain.Cart;

public class CartDAOTestCase {

	@Autowired 	static AnnotationConfigApplicationContext context;
	@Autowired	static CartDAO cartDAO;
	@Autowired	static Cart cart;
	@BeforeClass
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.PerfectShop");
		context.refresh();
		cartDAO=(CartDAO)context.getBean("cartDAO");
		cart=(Cart)context.getBean("cart");
	}
	

	//@Test
	public void testCart()
	{
		System.out.println("cart test case");
		cart.setCartId(11);
		cart.setEmail("vj");
		cart.setName("sef");
		cart.setPrice(200);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		cart.setDateAdded(date);
		cart.setStatus("jsevj");
		cartDAO.addToCart(cart);
	}
	
	//@Test
		public void testCartUpdate()
		{
			System.out.println("cart update test case");
			cart.setCartId(11);
			cart.setEmail("vj");
			cart.setName("nnnnnnn");
			cart.setPrice(250);
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date = simpleDateFormat.format(new Date());
			cart.setDateAdded(date);
			cart.setStatus("jsevj");
			cartDAO.updateCart(cart);
		}
		

	@Test
	public void testCartlist()
	{
		System.out.println("FAVouritetotal");
		int ac=cartDAO.listCart("vj").size();
		System.out.println(ac);
		assertEquals(1,ac);
	}
	
	
}
*/