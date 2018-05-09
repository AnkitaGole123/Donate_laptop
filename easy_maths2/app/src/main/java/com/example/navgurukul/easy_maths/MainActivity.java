package com.example.navgurukul.easy_maths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void saythanks (View view){
      //START CODE HERE
        TextView TV;
        TV = (TextView)findViewById(R.id.textView);
        TV.setVisibility(View.VISIBLE);
    }
}
