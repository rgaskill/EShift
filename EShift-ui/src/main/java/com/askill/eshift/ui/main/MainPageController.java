package com.askill.eshift.ui.main;

import com.askill.eshift.user.User;

public class MainPageController {

	private MainPage view = new MainPage();
	private MainPageModel model = new MainPageModel();
	
	public MainPageController(User user){
		model.setUser(user);
		view.setModel(model);
	}
	
	public MainPage getView(){
		return view;
	}
	
}
