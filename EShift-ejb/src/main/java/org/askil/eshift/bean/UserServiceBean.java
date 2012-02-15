package org.askil.eshift.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

import org.askil.eshift.client.services.UserService.UserServiceLocal;
import org.askil.eshift.client.services.UserService.UserServiceRemote;
import org.askil.eshift.user.User;
import org.hibernate.Session;

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

	@Override
	public List<User> getAllUsers() {
		List<User> ret = session.createQuery("from User u").list();
		return ret;
	}

	


}
