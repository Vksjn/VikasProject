package com.niit.PerfectShop.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PerfectShop.dao.ProductDAO;
import com.niit.PerfectShop.domain.Product;

@Repository(value="productDAO")
@EnableTransactionManagement
@Transactional
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public boolean save(Product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean updated(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean deleted(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public List<Product> listss() {
		// T
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	
	public Product get(String id) {
		// TODO Auto-generated method stub
		return(Product) sessionFactory.getCurrentSession().get(Product.class,id);
	}


	
	public List<Product> getAllProductByCategory(String category_id) {
		Query query=	sessionFactory.getCurrentSession().createQuery("from Product where category_id=?");
		query.setString(0, category_id);
		
	    return	query.list();
			
	    
			}

	
		
}
