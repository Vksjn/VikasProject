package com.niit.PerfectShop.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PerfectShop.dao.SupplierDAO;
import com.niit.PerfectShop.domain.Supplier;
@EnableTransactionManagement
@Transactional
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory= sessionFactory;
	}

	
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean updates(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean deletes(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public List<Supplier> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}


	public Supplier get(String id) {
		
		return (Supplier) sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}
	
	}
	