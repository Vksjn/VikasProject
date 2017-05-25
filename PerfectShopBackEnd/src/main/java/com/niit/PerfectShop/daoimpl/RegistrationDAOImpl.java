package com.niit.PerfectShop.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.PerfectShop.dao.RegistrationDao;
import com.niit.PerfectShop.domain.Registration;
@Repository("registrationDao")
@EnableTransactionManagement
@Transactional
public class RegistrationDAOImpl implements RegistrationDao {

	@Autowired
	private SessionFactory sessionFactory;
    public RegistrationDAOImpl(SessionFactory sessionFactory)
    {
    	this.sessionFactory = sessionFactory;
    }
    
	
	public boolean save(Registration registration) {
		try {
			sessionFactory.getCurrentSession().save(registration);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		return true;
	}


	public boolean update(Registration registration) {
		try {
			sessionFactory.getCurrentSession().update(registration);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		return true;
	}


	public boolean validate(String email, String password) {
		Query query=	sessionFactory.getCurrentSession().createQuery("from Registration where email = ? and password = ?");
		query.setString(0, email);
		query.setString(1, password);
		if(query.uniqueResult()==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}


	public List<Registration> lists() {
		return sessionFactory.getCurrentSession().createQuery("from Registration").list();
		
	}


	public Registration get(String email) {
		return (Registration) sessionFactory.getCurrentSession().get(Registration.class, email);
		
	}

}
	