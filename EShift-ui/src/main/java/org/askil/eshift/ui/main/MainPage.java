package org.askil.eshift.ui.main;

import org.askil.eshift.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class MainPage extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel mainContent;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private MenuBar mainMenu;



	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */



	



	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */



	



	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */



	



	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */



	



	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */



	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private static final Logger LOG = LoggerFactory.getLogger(MainPage.class);

	private MenuBar.MenuItem adminMenuItem;
	private MenuBar.MenuItem userAdminMenuItem;

	
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public MainPage() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		buildMainMenu();
		// TODO add user code here
	}



	@Override
	public void attach() {
		super.attach();

		User user = (User) getApplication().getUser();
		if ( user == null ){
			LOG.error("No user set.");
			return;
		}

		if ( !user.isAdmin() ){
			adminMenuItem.setVisible(false);
		} 
	}

	public void buildMainMenu(){
		adminMenuItem = mainMenu.addItem("Admin", null);
		userAdminMenuItem = adminMenuItem.addItem("User Admin", null);
	}

	public void setModel(MainPageModel model){

	}
	
	public void setUserAdminMenuCommand(MenuBar.Command command){
		userAdminMenuItem.setCommand(command);
	}

	public void setContent(ComponentContainer component){
		mainContent.setContent(component);
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// mainMenu
		mainMenu = new MenuBar();
		mainMenu.setImmediate(false);
		mainMenu.setWidth("100.0%");
		mainMenu.setHeight("-1px");
		mainLayout.addComponent(mainMenu);
		
		// mainContent
		mainContent = buildMainContent();
		mainLayout.addComponent(mainContent);
		mainLayout.setExpandRatio(mainContent, 1.0f);
		
		return mainLayout;
	}



	@AutoGenerated
	private Panel buildMainContent() {
		// common part: create layout
		mainContent = new Panel();
		mainContent.setImmediate(false);
		mainContent.setWidth("100.0%");
		mainContent.setHeight("100.0%");
		
		// verticalLayout_2
		verticalLayout_2 = new VerticalLayout();
		verticalLayout_2.setImmediate(false);
		verticalLayout_2.setWidth("100.0%");
		verticalLayout_2.setHeight("202.89%");
		verticalLayout_2.setMargin(false);
		mainContent.setContent(verticalLayout_2);
		
		return mainContent;
	}

}
