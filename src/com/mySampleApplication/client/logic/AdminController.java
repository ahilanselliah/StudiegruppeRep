package com.mySampleApplication.client.logic;

import com.google.gwt.view.client.ListDataProvider;
import com.mySampleApplication.client.ui.ContentPanel;
import com.mySampleApplication.client.ui.admin.adminMainView.AdminMainView;
import com.mySampleApplication.shared.User;

public class AdminController {

    private ContentPanel content;
    private AdminMainView adminMainView;
    //private RPCServiceAsync rpcServiceAsync
    private User currentUser;

    private ListDataProvider<User> listProviderUsers;

    public AdminController(ContentPanel content){
        this.content = new ContentPanel();
        this.adminMainView = new AdminMainView();
        //this.rpcServiceAsync = new RPCServiceAsync

        bindHandlers();

        listProviderUsers = new ListDataProvider <>();

        adminMainView.getAdminUsersView().initUsersTable(ListProviderUsers);
    }

    public void loadUser(User currentUser){
        this.currentUser = currentUser;
        loadTables();
    }

    public void bindHandlers() {
        adminMainView.getClickHandlers(new MenuClickHandler());
        adminMainView.getAdminUsersView().addClickHandler(new CreateUserClickHandler());
        adminMainView.getAdminUsersView().addClickHandler(new DeleteUserHandler());
    }
}
