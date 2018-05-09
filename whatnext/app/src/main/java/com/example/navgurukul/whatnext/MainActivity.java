package com.example.navgurukul.whatnext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Object masti;
    private Object sad;

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

        if (true){
            masti
        }
        else{
            sad
        }





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
