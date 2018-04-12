package com.mySampleApplication.client.ui.admin.adminMainView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class AdminMainView {
    interface AdminMainViewUiBinder extends UiBinder <DivElement, AdminMainView> {
    }

    private static AdminMainViewUiBinder ourUiBinder = GWT.create(AdminMainViewUiBinder.class);

    public AdminMainView() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}