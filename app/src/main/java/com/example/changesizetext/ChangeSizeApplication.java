package com.example.changesizetext;

import android.app.Application;

import com.example.changesizetext.model.User;

public class ChangeSizeApplication extends Application {

    private User user;

    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Rafa", "rafa2000inator@gmail.com");
    }
    public User getUser(){return user;}
}
