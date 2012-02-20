package org.askil.eshift.ui.user;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import org.askil.eshift.client.services.UserService.UserServiceLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.ui.ComponentContainer;

@SessionScoped
public class UserAdminController implements Serializable {

	
	private static final long serialVersionUID = 1795049094424774061L;

	private static Logger LOG = LoggerFactory.getLogger(UserAdminController.class);
	
	private UserAdminUI view = new UserAdminUI();
	private UserAdminModel model = new UserAdminModel();
	
	@EJB
    private UserServiceLocal userService;
	
	
	@PostConstruct
	private void init(){
		view.setModel(model);
	}
	
	public void loadData(){
		model.setUsers(userService.getAllUsers());
	}


	public ComponentContainer getView() {
		return view;
	}
}
