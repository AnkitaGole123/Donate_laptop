package com.example.edittextdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.navgurukul.getting.R;

public class MainActivity extends Activity {
    EditText ed1, ed2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.edit1);
        ed2 = (EditText) findViewById(R.id.edit2);

        btn1 = (Button) findViewById(R.id.getTextBtn);
        btn2 = (Button) findViewById(R.id.setTextBtn);

        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String getTextString = ed1.getText().toString();
                btn1.setText(getTextString);
            }
        });

        btn2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String setTextStreing = btn2.getText().toString();
                ed2.setText(setTextStreing);
            }
        });
    }