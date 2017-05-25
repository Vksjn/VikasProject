package com.niit.PerfectShop.daoimpl;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PerfectShop.dao.CartDAO;
import com.niit.PerfectShop.domain.Cart;

@Repository(value="cartDAO")
@Transactional
@EnableTransactionManagement
public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	public boolean addToCart(Cart cart) {
		
		System.out.println("adding cart");
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean updateCart(Cart cart) {
		System.out.println("update");
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	}

	
	public List<Cart> listCart(String email) {
		Query query=	sessionFactory.getCurrentSession().createQuery("from Cart  where  email = ?");
		query.setString(0, email);
		
	    return	query.list();
	}

	
	public long getTotalAmount(String email) {
		/*Query query= sessionFactory.getCurrentSession().createQuery("select sum(price) from Cart where email=?"); 
		System.out.println("result is:");
		query.setString(0, email);*/
		return 1;
	}
	
	
}
