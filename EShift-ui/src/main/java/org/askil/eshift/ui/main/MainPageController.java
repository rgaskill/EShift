package org.askil.eshift.ui.main;

import org.askil.eshift.ui.user.UserAdminController;
import org.askil.eshift.ui.user.UserAdminUI;
import org.askil.eshift.user.User;

import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;

public class MainPageController {

	private MainPage view = new MainPage();
	private MainPageModel model = new MainPageModel();
	
	public MainPageController(User user){
		model.setUser(user);
		view.setModel(model);
		view.setUserAdminMenuCommand(new UserAdminCommand());
	}
	
	public MainPage getView(){
		return view;
	}
	
	private class UserAdminCommand implements MenuBar.Command {

		@Override
		public void menuSelected(MenuItem selectedItem) {
			UserAdminController adminController = new UserAdminController();
			view.setContent(adminController.getView());
			
		}
		
	}
	
}
