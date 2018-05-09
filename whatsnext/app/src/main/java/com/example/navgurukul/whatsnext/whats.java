import java.util.Scanner;
import java.math.BigInteger;
package com.example.navgurukul.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.navgurukul.whatsnext.R;

import java.util.Random;

public class whats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
class AddingLargeNumbers {
    public static void main(String[] args) {
        String number1, number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first large number");
        number1 = in.nextLine();

        System.out.println("Enter second large number");
        number2 = in.nextLine();

        BigInteger first  = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;

        sum = first.add(second);

        System.out.println("Result of addition = " + sum);
    }
}