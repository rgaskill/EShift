package com.askill.eshift.ui;

import java.security.Principal;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;

import com.askill.eshift.client.services.UserService;
import com.askill.eshift.user.User;
import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.AbstractApplicationServlet;

@WebServlet(urlPatterns = {"/ui/*", "/VAADIN/*"})
public class EShiftServlet extends AbstractApplicationServlet {

	@Inject
	private Instance<EShiftApplication> application;
	
	@Inject
    private UserService userService;
	
	@Override
	protected Application getNewApplication(HttpServletRequest request)
			throws ServletException {
		EShiftApplication app = application.get();
		
		Principal principal = request.getUserPrincipal();
		if (principal == null) {
            throw new ServletException("Access denied");
        }
		
		User user = userService.getUser(principal.getName());
		
		app.setUser(user);
		app.setLogoutURL(request.getContextPath() + "/logout.jsp");
		return app;
	}

	@Override
	protected Class<? extends Application> getApplicationClass()
			throws ClassNotFoundException {
		return EShiftApplication.class;
	}

	
	
}
