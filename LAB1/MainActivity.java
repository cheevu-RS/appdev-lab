package com.example.cse.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}

    public void add(View view) {

        EditText number1=(EditText) findViewById(R.id.editText3);
        EditText number2=(EditText) findViewById(R.id.editText4);
        double num1 = Double.parseDouble(number1.getText().toString());
        double num2 = Double.parseDouble(number2.getText().toString());
        Button Add_button=(Button) findViewById(R.id.add_button);
        double sum = num1 + num2;
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = String.valueOf(sum);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sub(View view) {

        EditText number1=(EditText) findViewById(R.id.editText3);
        EditText number2=(EditText) findViewById(R.id.editText4);
        double num1 = Double.parseDouble(number1.getText().toString());
        double num2 = Double.parseDouble(number2.getText().toString());
        Button Add_button=(Button) findViewById(R.id.sub_button);
        double sum = num1 - num2;
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = String.valueOf(sum);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void mul(View view) {

        EditText number1=(EditText) findViewById(R.id.editText3);
        EditText number2=(EditText) findViewById(R.id.editText4);
        double num1 = Double.parseDouble(number1.getText().toString());
        double num2 = Double.parseDouble(number2.getText().toString());
        Button Add_button=(Button) findViewById(R.id.mul_button);
        double sum = num1 * num2;
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = String.valueOf(sum);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void div(View view) {

        EditText number1=(EditText) findViewById(R.id.editText3);
        EditText number2=(EditText) findViewById(R.id.editText4);
        double num1 = Double.parseDouble(number1.getText().toString());
        double num2 = Double.parseDouble(number2.getText().toString());
        Button Add_button=(Button) findViewById(R.id.div_button);
        double sum = num1 / num2;
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = String.valueOf(sum);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
