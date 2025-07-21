package com.example.FirstPage;



import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends VerticalLayout
{
    public LoginView()
    {
        // username field
        TextField usernameField = new TextField("Username");

        // password field
        PasswordField passwordField = new PasswordField("Password");

        // Button
        Button button = new Button("Enter");


        button.addClickListener(e ->
        { 
            String username = usernameField.getValue();
            String password = passwordField.getValue();

            if (!username.isEmpty() && !password.isEmpty())
            {
                Notification.show("Login Successfully.");
            }
            else 
            {
                Notification.show("Enter your username and password");
            }
        });

        add(usernameField, passwordField, button);
    }    
}
