package org.askil.eshift.ui.role;

import org.askil.eshift.ui.user.table.UserTableBean;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Table;

public class UserRoleUI  extends CustomComponent {

	private Table roleTable;
	
	
	public UserRoleUI() {
//		buildMainLayout();
//		setCompositionRoot(mainLayout);

		roleTable.setColumnReorderingAllowed(true);

		roleTable.setColumnHeader(UserTableBean.FIRST_NAME, "First Name");
		roleTable.setColumnHeader(UserTableBean.LAST_NAME, "Last Name");
		roleTable.setColumnHeader(UserTableBean.EMAIL, "Email");
		roleTable.setColumnHeader(UserTableBean.CTRL_USER, "Added By");
		roleTable.setColumnHeader(UserTableBean.CTRL_DATE, "Added On");
		roleTable.setColumnHeader(UserTableBean.USER_ROLES, "User Roles");



	}
	
}
