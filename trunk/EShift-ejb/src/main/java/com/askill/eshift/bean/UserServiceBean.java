package com.askill.eshift.bean;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import com.askill.eshift.client.services.UserService.UserServiceLocal;
import com.askill.eshift.client.services.UserService.UserServiceRemote;
import com.askill.eshift.user.User;

@Stateless
public class UserServiceBean implements UserServiceLocal, UserServiceRemote {

	@PersistenceContext( unitName = "EShift" )
	private Session session;

	@Override
	public User getUser(String email) {
		User user = (User) session.createQuery("from User u" +
				" left join fetch u.userRoles" +
				" where u.email = ?")
				.setString(0, email).uniqueResult();
		return user;
	}

	@Override
	public void createUser(User user) {
		session.save(user);
	}



}
