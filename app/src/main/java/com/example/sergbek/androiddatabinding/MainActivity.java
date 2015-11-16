package com.example.sergbek.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sergbek.androiddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
//        User_2 user_2 = new User_2("Vasia","Petrovich");
        User_2 user_2 = new User_2("Vasia","Petrovich");
        mActivityMainBinding.setUser(user_2);
        mActivityMainBinding.setHandler(new ClickHandler(user_2,15));
    }
}
