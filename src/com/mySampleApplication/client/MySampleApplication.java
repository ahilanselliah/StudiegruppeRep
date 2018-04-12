package com.mySampleApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.mySampleApplication.client.logic.MainController;
import com.mySampleApplication.client.ui.ContentPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        //Instantiate the "screen" (panel)
        ContentPanel content = new ContentPanel();
        //adding the "screen" to the RootLayoutPanel
        RootLayoutPanel.get().add(content);
        //Instantiate the RPC service
        //RPCServiceAsync rpcService = GWT.create(RPCService.class);
        //Passes the "screen" and the RPC service to the MainController
        new MainController(content);

    }
}
