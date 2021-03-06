package org.askil.eshift.ui.user.table;

import java.util.Date;
import java.util.Iterator;

import org.askil.eshift.user.User;
import org.askil.eshift.user.UserRole;

public class UserTableBean {

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String EMAIL = "email";
	public static final String CTRL_USER = "ctrlUser";
	public static final String CTRL_DATE = "ctrlDate";
	public static final String USER_ROLES = "userRoles";
	
	private User user;
	
	private String roles = "";
	
	public UserTableBean(User user){
		this.user = user;
		
		for (Iterator<UserRole> itr = user.getUserRoles().iterator(); itr.hasNext();) {
			UserRole role = itr.next();
			roles += role.getUserRole();
			if ( itr.hasNext() ){
				roles += ",";
			}
		}
	}

	public String getFirstName() {
		return user.getFirstName();
	}

	public String getLastName() {
		return user.getLastName();
	}

	public String getEmail() {
		return user.getEmail();
	}

	public String getCtrlUser() {
		return user.getCtrlUser();
	}

	public Date getCtrlDate() {
		return user.getCtrlDate();
	}

	public String getUserRoles() {
		return roles;
	}

	@Override
	public int hashCode() {
		return user.getId().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTableBean other = (UserTableBean) obj;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.getId().equals(other.user.getId()))
			return false;
		return true;
	}
	
	
	
	
}
