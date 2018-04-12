package com.mySampleApplication.client.ui.admin.adminUsersView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class AdminUsersView {
    interface AdminUsersViewUiBinder extends UiBinder <DivElement, AdminUsersView> {
    }

    private static AdminUsersViewUiBinder ourUiBinder = GWT.create(AdminUsersViewUiBinder.class);

    public AdminUsersView() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}