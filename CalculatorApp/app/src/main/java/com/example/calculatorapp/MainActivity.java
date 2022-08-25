package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
        closeKeyboard();
    }

    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int diff = num1 - num2;

        numberSumTV.setText("" + diff);
        closeKeyboard();
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double quotient = num1 / num2;

        numberSumTV.setText("" + quotient);
        closeKeyboard();

    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int product = num1 * num2;

        numberSumTV.setText("" + product);
        closeKeyboard();
    }

    public void findSqrt(View view) {
        EditText number3ET = findViewById(R.id.num3ET);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Double.parseDouble(number3ET.getText().toString());

        double sqrt = Math.sqrt(num1);


        numberSumTV.setText("" + sqrt);
        closeKeyboard();

    }
    public void findAbsVal(View view) {
        EditText number3ET = findViewById(R.id.num3ET);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Double.parseDouble((number3ET.getText().toString()));

        double absVal = Math.abs(num1);

        numberSumTV.setText("" + absVal);
        closeKeyboard();
    }
    public void findPower(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());

        double power = Math.pow(num1, num2);


        numberSumTV.setText("" + power);
        closeKeyboard();
    }

    public void findSine(View view){
        EditText number3ET = findViewById(R.id.num3ET);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Double.parseDouble((number3ET.getText().toString()));

        double sine = Math.sin(num1);

        numberSumTV.setText("" + sine);
        closeKeyboard();

    }


    //I got this method from geekforgeeks.org
    //direct link ------>  https://www.geeksforgeeks.org/how-to-programmatically-hide-android-soft-keyboard/
    private void closeKeyboard()
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        View view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {

            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }

}