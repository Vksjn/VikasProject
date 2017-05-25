
package com.niit.PerfectShop.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PerfectShop.dao.CategoryDAO;
import com.niit.PerfectShop.domain.Category;
import com.niit.PerfectShop.domain.User;

@Repository("categoryDAO")
@EnableTransactionManagement
@Transactional


public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory= sessionFactory;
	}

	
	public boolean save(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean delete(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public List<Category> lists() {
		
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}


	public Category get(String id) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
		
	}

}
