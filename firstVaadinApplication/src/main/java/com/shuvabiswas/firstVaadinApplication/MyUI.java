
package com.shuvabiswas.firstVaadinApplication;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;  
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	VerticalLayout verticalLayout = new VerticalLayout();
    	
    	TextField textField = new TextField();
    	textField.setCaption("First Name");
    	
    	TextField textField2 = new TextField();
    	textField2.setCaption("last Name");
    	
    	TextField textField3 = new TextField("User Name");
    	
    	
    	PasswordField passwordField = new PasswordField();
    	passwordField.setCaption("Enter Password");
    	
    	Button button = new Button("Login");
    	button.addClickListener(e->{
    		Notification.show("Login Successfuly");
    	});
    	
    	verticalLayout.setMargin(true);
    	verticalLayout.setSpacing(true);
    	verticalLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
    	verticalLayout.addComponents(textField, textField2, textField3, passwordField, button);
    	setContent(verticalLayout);
    	
    	/*
    	final HorizontalLayout horizontalLayout = new HorizontalLayout();
    	
    	final TextField name = new TextField("User Name");
    	
    	Button clickBtn = new Button("Click Me");
    	
    	Label label = new Label();
    	
    	clickBtn.addClickListener( e -> {
    		label.setValue(name.getValue());
    		Notification.show("Hello "+name.getValue());
    	});
    	
    	horizontalLayout.setMargin(true);
    	horizontalLayout.setSpacing(true);
    	
    	horizontalLayout.addComponents(name, clickBtn, label);
    	setContent(horizontalLayout);*/
    	
    	
    	
        /*final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        layout.addComponents(name, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);*/
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
