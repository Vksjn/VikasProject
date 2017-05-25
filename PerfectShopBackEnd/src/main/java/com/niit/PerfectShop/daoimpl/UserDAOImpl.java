
package com.niit.PerfectShop.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PerfectShop.dao.UserDAO;
import com.niit.PerfectShop.domain.User;
@Repository("userDAO")
@EnableTransactionManagement
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
    public UserDAOImpl(SessionFactory sessionFactory)
    {
    	this.sessionFactory = sessionFactory;
    }
    
	
	public boolean save(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean validate(String id, String password) {
	Query query=	sessionFactory.getCurrentSession().createQuery("from User where id = ? and password = ?");
	query.setString(0, id);
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

	
	
	
	public List<User> lists() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

		public User get(String id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

}
