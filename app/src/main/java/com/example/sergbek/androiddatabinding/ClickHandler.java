package com.example.sergbek.androiddatabinding;

import android.view.View;

/**
 * Created by Sergbek on 11.11.2015.
 */
public class ClickHandler {

    private final User_2 mUser;
    private int age;

    public ClickHandler(User_2 user, int age) {
        this.mUser = user;
        this.age = age;
    }

    public void onClick(View view) {
//        mUser.setLastName(mUser.getLastName() + " age: " + age);
        mUser.lastName.set("");
        mUser.firstName.set(mUser.firstName.get() + " age: " + age);
    }
}
