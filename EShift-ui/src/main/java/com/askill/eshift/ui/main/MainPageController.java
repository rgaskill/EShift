package com.askill.eshift.ui.main;

import com.askill.eshift.ui.user.UserAdminUI;
import com.askill.eshift.user.User;
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
			view.setContent(new UserAdminUI());
			
		}
		
	}
	
}
