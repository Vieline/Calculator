package com.stephany.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputOne, inputTwo;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOne = findViewById(R.id.inputOne);
        inputTwo = findViewById(R.id.inputTwo);

        txtResult = findViewById(R.id.textViewResult);
    }
    //listener - function that is executed when you do something on the screen
    public void add(View v){
        Toast.makeText(this, "Add Clicked", Toast.LENGTH_SHORT).show();
        //collect
        String x = inputOne.getText().toString().trim();
        String y = inputTwo.getText().toString().trim();
        //check
        if (x.isEmpty() || y.isEmpty())
            return;
        //convert
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        //calculate and display
        int result = a + b;
        txtResult.setText("" + result);

    }
    public void subtract(View v){
        Toast.makeText(this, "Subract Clicked", Toast.LENGTH_SHORT).show();
        String x = inputOne.getText().toString().trim();
        String y = inputTwo.getText().toString().trim();
        //check
        if (x.isEmpty() || y.isEmpty())
            return;
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);

        int result = a - b;
        txtResult.setText("" + result);
    }
    public void multiply(View v){
        Toast.makeText(this, "Multiply Clicked", Toast.LENGTH_SHORT).show();
        String x = inputOne.getText().toString().trim();
        String y = inputTwo.getText().toString().trim();
        //check
        if (x.isEmpty() || y.isEmpty())
            return;
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);

        int result = a * b;
        txtResult.setText("" + result);
    }
    public void divide(View v){
        Toast.makeText(this, "Divide Clicked", Toast.LENGTH_SHORT).show();
        String x = inputOne.getText().toString().trim();
        String y = inputTwo.getText().toString().trim();
        //check
        if (x.isEmpty() || y.isEmpty())
            return;
        int a = Integer.parseInt(x);
        double b = Double.parseDouble(y);

        double result = a / b;
        txtResult.setText("" + result);
    }
}
