package com.apex.user.client;

import com.apex.user.dao.UserDAO;
import com.apex.user.entity.User;

public class UserDaoClient {
	
	public static void main(String[] args) {
		
//		User user = new User();
		
		/*
		 * user.setFirstName("soham"); 
		 * user.setLastname("narang");
		 * user.setMiddleName("unk");
		 */
		
		int userId = 5;
		
		UserDAO userDao = new UserDAO();
		
//		create(userDao, user);
		
//		get(userDao, userId);
		
		update(userDao, userId, "updated");
		
//		delete(userDao, userId);
		
	}
	
	private static void create(UserDAO userDao, User user) {
		
		userDao.createUser(user);
		
	}
	
	public static User get(UserDAO userDao,int userid) {
		
		User user = userDao.getUser(userid);
		
		return user;
	}
	
	private static void update(UserDAO userDao, int userId, String string) {
		
		User user = userDao.getUser(userId);
		System.out.println(user);
		user.setFirstName("update");
		user.setLastname("2");
		user.setMiddleName(string);
		userDao.updateUser(user);
		
	}
	
	private static void delete(UserDAO userDao, int userId) {
		
		UserDAO theUserDao = new UserDAO();
		User user = theUserDao.getUser(userId);
		System.out.println(user);
		userDao.deleteUser(user);
		
	}
	
	
}
