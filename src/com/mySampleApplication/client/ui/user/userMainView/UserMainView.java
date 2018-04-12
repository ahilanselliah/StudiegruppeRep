package com.mySampleApplication.client.ui.user.userMainView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class UserMainView {
    interface UserMainViewUiBinder extends UiBinder <DivElement, UserMainView> {
    }

    private static UserMainViewUiBinder ourUiBinder = GWT.create(UserMainViewUiBinder.class);

    public UserMainView() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}