package com.mySampleApplication.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mySampleApplication.client.ui.admin.adminMainView.AdminMainView;
import com.mySampleApplication.client.ui.login.LoginView;
import com.mySampleApplication.client.ui.user.userMainView.UserMainView;


public class ContentPanel extends Composite {
    private DeckLayoutPanel contentPanel;
    private LoginView loginView;
    private AdminMainView adminMainView;
    private UserMainView userMainView;

    public ContentPanel(){
        contentPanel = new DeckLayoutPanel();

        loginView = new LoginView();
        contentPanel.add(loginView);

        userMainView = new UserMainView();
        contentPanel.add(userMainView);

        adminMainView = new AdminMainView();
        contentPanel.add(adminMainView);

        contentPanel.showWidget(LoginView);

        initWidget(contentPanel);
    }

    //Metode til at skifte "deck"
    public void changeView(Widget panel){
        contentPanel.showWidget(panel);
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public UserMainView getUserMainView() {
        return userMainView;
    }

    public AdminMainView getAdminMainView() {
        return adminMainView;
    }
}
