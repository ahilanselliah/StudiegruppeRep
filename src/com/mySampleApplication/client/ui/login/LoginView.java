package com.mySampleApplication.client.ui.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;


public class LoginView extends Composite{

    private static LoginViewUiBinder uiBinder = GWT.create(LoginViewUiBinder.class);
    @UiField
    TextBox usernameTextBox;
    @UiField
    PasswordTextBox passwordTextBox;
    @UiField
    Button loginBtn;


    interface LoginViewUiBinder extends UiBinder <HTMLPanel, LoginView> {
    }

    public LoginView(){
        initWidget(uiBinder.createAndBindUi(this));

        usernameTextBox.getElement().setPropertyString("placeholder","username");
        usernameTextBox.getElement().setPropertyString("placeholder","password");
    }

    public void addClickHandlers(ClickHandler clickHandler){
        loginBtn.addClickHandler(clickHandler);
    }

    public void clearTextBoxFields(){
        usernameTextBox.setText("");
        passwordTextBox.setText("");
    }

    public TextBox getUsernameTextBox(){ return usernameTextBox; }

    public PasswordTextBox getPasswordTextBox() { return passwordTextBox; }


    /**private static LoginViewUiBinder ourUiBinder = GWT.create(LoginViewUiBinder.class);
     *
    *public LoginView() {
    *    DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }*/
}