package com.example.navgurukul.number.maths;

import
        android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.navgurukul.maths.R;

import java.util.Random;

public class maths extends AppCompatActivity { @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maths);
}

    public void nextNumber (View view){
        //code starts here

        //generate random number
        Random r = new Random();
        Integer i;
        i = r.nextInt(20*2 );
        Integer s;
        s = r.nextInt(10*3 );

        //set random number in textview
        TextView tv;
        tv = findViewById(R.id.textview);
        tv.setText(Integer.toString(i));
        tv = findViewById(R.id.textview2);
        tv.setText(Integer.toString(s));


    }
}

