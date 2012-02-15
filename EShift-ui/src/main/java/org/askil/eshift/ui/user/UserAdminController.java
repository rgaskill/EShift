package org.askil.eshift.ui.user;

import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.askil.eshift.client.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.ui.ComponentContainer;

public class UserAdminController {

	private static Logger LOG = LoggerFactory.getLogger(UserAdminController.class);
	
	private UserAdminUI view = new UserAdminUI();
	private UserAdminModel model = new UserAdminModel();
	
    private UserService userService;
	
	public UserAdminController(){
		try {
			InitialContext ic = new InitialContext();
			 userService = (UserService) ic.lookup("UserServiceBean!org.askil.eshift.client.services.UserService$UserServiceLocal");
		} catch (NamingException e) {
			LOG.error("Unable to lookup service.",e);
		}
		
		
		view.setModel(model);
		initModel();
	}
	
	
	private void initModel(){
		model.setUsers(userService.getAllUsers());
	}


	public ComponentContainer getView() {
		return view;
	}
}
