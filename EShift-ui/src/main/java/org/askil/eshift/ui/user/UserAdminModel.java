package org.askil.eshift.ui.user;

import java.util.List;

import org.askil.eshift.user.User;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanContainer;

public class UserAdminModel {

	private BeanContainer<Integer, User> userTableModel = new BeanContainer<>(User.class);
	
	public UserAdminModel(){
		userTableModel.setBeanIdProperty("id");
	}
	
	public void setUsers(List<User> users){
		userTableModel.removeAllItems();
		userTableModel.addAll(users);
	}
	
	public Container getUserTableModel() {
		return userTableModel;
	}

}
