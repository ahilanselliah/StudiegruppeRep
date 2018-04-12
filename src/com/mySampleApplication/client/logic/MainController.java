package com.mySampleApplication.client.logic;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.mySampleApplication.client.ui.ContentPanel;

public class MainController {

    private ContentPanel content;
    //private RPCServiceAsync rpcService;

    private AdminController adminController;
    private UserController userController;

    //Konstruktør for MainController
    public MainController(ContentPanel content){
        this.content = content;
        //this.rpcService = rpcService;

        this.adminController = adminController;
        this.userController = userController;

        bindHandlers();
    }


    //Tilføjer Handler til login knappen
    private void bindHandlers(){content.getLoginView().addClickHandlers(new LoginClickHandler());}

    //Håndtering clicks på login knappen
    class LoginClickHandler implements ClickHandler{
        @Override
        public void onClick(ClickEvent event) {
            //Få teksten fra de to tekst bokse
            String username = content.getLoginView().getUsernameTextBox().getText();
            String password = content.getLoginView().getPasswordTextBox().getText();

            //Autorisering fra RPC

        }
    }



}
