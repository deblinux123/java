package com.example.LogInForm;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/register")
public class RegisterView extends VerticalLayout
{
    public RegisterView(UserService userService)
    {
        TextField username = new TextField("Username");
        TextField email = new TextField("Email");

        Button register = new Button("Register");

        register.addClickListener(event -> {
            User user = new User();
            user.setName(username.getValue());
            user.setEmail(email.getValue());

            userService.save(user);
            Notification.show("User Registered");
        });

        add(username, email, register);
    }
}
