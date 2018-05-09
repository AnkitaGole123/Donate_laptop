package com.example.navgurukul.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextquestion (View view){
        //code starts here

        //generate two number
        Integer num1, num2;
        num1= generateRandomNumbetr(10);
        num2= generateRandomNumbetr(20);



        //set random number in textview
        TextView tv;
        tv = findViewById(R.id.quesion);
        tv.setText(Integer.toString(num1) + "x" + Integer.toString(num2));



    }

    public void newqueastion(View view){

        //read a number
        TextView tv = findViewById(R.id.quesion);
        String quesion = tv.getText().toString();

        //split a number

        String[] numbers = quesion.split("X");

        Log.d("numbers", numbers[0]+ "," + numbers[1]);

        // convert number to integer// use log
    }


    public void nextanswer(View view){
    }

    public int generateRandomNumbetr( int limit){
        Random r = new Random();
        Integer i;
        i = r.nextInt(20);

    return i;
    }


}