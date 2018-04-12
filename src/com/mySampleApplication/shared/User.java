package com.mySampleApplication.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class User implements IsSerializable {

    private int id;
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public int getId(){ return id; }

    public String getUsername() { return username; }

    public String getPassword() { return password; }
}
