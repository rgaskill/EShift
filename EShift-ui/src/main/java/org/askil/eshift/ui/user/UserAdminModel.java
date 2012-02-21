package org.askil.eshift.ui.user;

import java.util.List;

import org.askil.eshift.ui.user.table.UserAdminTableModelHelper;
import org.askil.eshift.user.User;

import com.vaadin.data.Container;

public class UserAdminModel {

	private UserAdminTableModelHelper tableModelHelper = new UserAdminTableModelHelper();
	
	public UserAdminModel(){
	}
	
	public void setUsers(List<User> users){
		tableModelHelper.removeAllItems();
		tableModelHelper.addAll(users);
	}
	
	public Container getUserTableModel() {
		return tableModelHelper.getContainer();
	}

}
