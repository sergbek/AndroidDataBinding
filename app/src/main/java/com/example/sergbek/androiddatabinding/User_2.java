package com.example.sergbek.androiddatabinding;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Sergbek on 11.11.2015.
 */
public class User_2 {

    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();


    public User_2 (String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }

}
