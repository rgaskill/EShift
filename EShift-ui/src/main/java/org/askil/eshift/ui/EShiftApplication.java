/*
 * Copyright 2009 IT Mill Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.askil.eshift.ui;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import org.askil.eshift.ui.main.MainPage;
import org.askil.eshift.ui.main.MainPageController;

import com.vaadin.Application;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SessionScoped
public class EShiftApplication extends Application
{
	private Window window;
	
	@Inject
	private MainPageController controller;
	
	
	@Override
	public void init()
	{
		window = new Window("EShift");
		setMainWindow(window);
		
		MainPage view = controller.getView();
		window.setContent(view);

	}
	

}
