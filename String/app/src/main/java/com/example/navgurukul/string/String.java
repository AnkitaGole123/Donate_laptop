package com.example.navgurukul.string;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class String extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
    }

    public void main(String[] args) {
        java.lang.String a = "w3schools";
        java.lang.String b = ".in";
        java.lang.String c = a.concat(b);
        System.out.println(c);

    }

}