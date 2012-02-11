package org.askil.eshift.client.services;

import javax.ejb.Local;
import javax.ejb.Remote;

import org.askil.eshift.user.User;

public interface UserService {

	public User getUser(String email);
	
	public void createUser(User user);
	
	
	@Local
	public interface UserServiceLocal extends UserService {}
	
	@Remote
	public interface UserServiceRemote extends UserService {}
	
}
