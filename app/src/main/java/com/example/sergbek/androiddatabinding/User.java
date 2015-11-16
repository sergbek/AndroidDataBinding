//package com.example.sergbek.androiddatabinding;
//
//
//import android.databinding.BaseObservable;
//import android.databinding.Bindable;
//
//import com.example.sergbek.androiddatabinding.BR;
//
//public class User extends BaseObservable {
//
//    private String firstName;
//    private String lastName;
//    private int age;
//
//
//    public User(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    @Bindable
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//        notifyPropertyChanged(BR.firstName);
//    }
//
//    @Bindable
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//        notifyPropertyChanged(BR.lastName);
//    }
//
//    @Bindable
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
