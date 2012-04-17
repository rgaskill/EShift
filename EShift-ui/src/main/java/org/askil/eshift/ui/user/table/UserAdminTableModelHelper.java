package org.askil.eshift.ui.user.table;

import java.util.List;

import org.askil.eshift.user.User;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;


public class UserAdminTableModelHelper {

	private BeanItemContainer<UserTableBean> userTableModel = new BeanItemContainer<UserTableBean>(UserTableBean.class);
	
	
	public Container getContainer(){
		return userTableModel;
	}


	public boolean removeAllItems() {
		return userTableModel.removeAllItems();
	}


	public void addAll(List<User> users) {
		for (User user : users) {
			userTableModel.addBean(new UserTableBean(user));
		}
	}
}
