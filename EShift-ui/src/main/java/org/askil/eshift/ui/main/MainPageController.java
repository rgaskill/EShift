package org.askil.eshift.ui.main;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import org.askil.eshift.ui.user.UserAdminController;

import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;

@SessionScoped
public class MainPageController implements Serializable{

	private MainPage view = new MainPage();
	private MainPageModel model = new MainPageModel();
	
	@Inject
	private UserAdminController adminController;
	
	public MainPageController(){
		view.setModel(model);
		view.setUserAdminMenuCommand(new UserAdminCommand());
	}
	
	public MainPage getView(){
		return view;
	}
	
	private class UserAdminCommand implements MenuBar.Command {

		@Override
		public void menuSelected(MenuItem selectedItem) {
			adminController.loadData();
			view.setContent(adminController.getView());
			
		}
		
	}
	
}
