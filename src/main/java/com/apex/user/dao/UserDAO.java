package com.apex.user.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apex.user.entity.User;
import com.apex.user.util.HibernateUtil;

public class UserDAO {
	
	public void createUser(User user) {
		
		Session session =  HibernateUtil.getSessionFactory().openSession();
		Transaction tx =  session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	
	public User getUser(int userid) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		User user = session.load(User.class, userid);
		
//		session.close();
		
		return user;
		
	}
	
	public void updateUser(User user) {
		
		Session session =  HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx =  session.beginTransaction();
		
		session.saveOrUpdate(user);
		
		tx.commit();
		
		session.close();
		
	}

	public void deleteUser(User user) {
		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.delete(dept);
//		tx.commit();
//		session.close();
		
		Session session; 
		
		try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
        } catch (HibernateException ex) {
            session = HibernateUtil.getSessionFactory().openSession();
        }
		
		Transaction tx =  session.beginTransaction();
		
		System.out.println(user.getUserId());
		
		session.delete(user);
//		session.remove(user);
		
		tx.commit();
		
		if(session.isOpen())
			session.close();
	}
}
