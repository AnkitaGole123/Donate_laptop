package com.example.navgurukul.cool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextNumber(View view_){
        //start code

        Random r = new Random();
        Integer num1;
        num1 = r.nextInt(100);

        //generate second random number

        Integer num2;
        num2 = r.nextInt(100);


        //generate random number
        TextView tv;
        tv = findViewById(R.id.text);
        tv.setText(Integer.toString(num1) + "X" + Integer.toString(num2));

    }

    public void Question(View view){

        Random r = new Random();
        Integer new1;
        new1 = r.nextInt(100);

        //generate second random number

        Integer new2;
        new2 = r.nextInt(100);

        TextView tv;
        tv = findViewById(R.id.text);
        tv.getText().toString();

    }
}
