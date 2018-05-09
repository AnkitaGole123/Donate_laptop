package com.example.navgurukul.omg;

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

    public void Next(View view){
        //code starts here

        //generate two number
        Integer num1, num2;
        num1= generateRandomNumber(10);
        num2= generateRandomNumber(20);
Log.d("num1", Integer.toString(num1));
Log.d("num2", Integer.toString(num2));

        //set random number in TextView
        TextView tv;
        tv = findViewById(R.id.Question);
        tv.setText(String.format("%sx%s", Integer.toString(num1), Integer.toString(num2)));



    }

    public void Newquestion(View view){

        //read a number
        TextView tv = findViewById(R.id.Question);
        String Question = tv.getText().toString();
        Log.d("Q",Question);

        //split a number

        String[] numbers = Question.split("X");

        Log.d("numbers", numbers[0]+ "," + numbers[1]);

        // convert number to integer// use log
        Integer num1, num2 ;
        num1 = Integer.valueOf(numbers[0]);
        num2 = Integer.valueOf(numbers[1]);

        Log.d("Int numbers", Integer.toString(num1)+ "," + Integer.toString(num2));
    }








    public int generateRandomNumber( int limit){
        Random r = new Random();
        Integer i;
        i = r.nextInt(limit);

        return i;
    }


}

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
}
//
//<ImageView
//        android:id="@+id/image_visible"
//                android:layout_width="300dp"
//                android:layout_height="200dp"
//                android:src="/home/pooja/Welcome.jpg"
//                android:layout_marginLeft="40dp"
//                android:visibility="invisible"/>
