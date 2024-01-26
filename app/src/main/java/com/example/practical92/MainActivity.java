package com.example.practical92;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void onAddClick(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = num1 + num2;
        textViewResult.setText("Result: " + result);
    }

    public void onSubtractClick(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = num1 - num2;
        textViewResult.setText("Result: " + result);
    }

    public void onMultiplyClick(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = num1 * num2;
        textViewResult.setText("Result: " + result);
    }

    public void onDivideClick(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        if (num2 == 0) {
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            return;
        }
        double result = num1 / num2;
        textViewResult.setText("Result: " + result);
    }
}