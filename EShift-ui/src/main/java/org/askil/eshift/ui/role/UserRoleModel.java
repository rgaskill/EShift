package org.askil.eshift.ui.role;

import java.util.List;

import org.askil.eshift.user.UserRole;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;

public class UserRoleModel {

	private BeanItemContainer<UserRole> userRoleTableModel = new BeanItemContainer<>(UserRole.class);
	
	public void setRoles(List<UserRole> users){
		userRoleTableModel.removeAllItems();
		userRoleTableModel.addAll(users);
	}
	
	public Container getUserTableModel() {
		return userRoleTableModel;
	}
	
}
