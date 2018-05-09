package com.example.navgurukul.mathsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView display;
    Button check, generate;
    EditText input;

    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display_text);
        check = findViewById(R.id.answer_check);
        generate = findViewById(R.id.number_generate);
        input = findViewById(R.id.input_number);

        //on Click generate Number....
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random_number1 = new Random();
                int number1 = random_number1.nextInt(100);
                int number2 = random_number1.nextInt(100);

                int result = (number1 * number2);
                total = result;

                String string1 = (Integer.toString(number1));
                String string2 = (Integer.toString(number2));
                display.setText(string1 + " X " + string2);

                ImageView tv;
                tv= (ImageView) findViewById(R.id.image_visual);
                tv.setVisibility(tv.VISIBLE);

            }
        });

    }


 }




