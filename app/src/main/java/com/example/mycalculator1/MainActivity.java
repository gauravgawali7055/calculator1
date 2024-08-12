package com.example.mycalculator1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText firstValue, secondValue;
    TextView tvAns;
    Button add, sub, mul, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = findViewById(R.id.edFirstValue);
        secondValue = findViewById(R.id.ediSecondValue);
        tvAns = findViewById(R.id.textView);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSub);
        mul = findViewById(R.id.buttonMul);
        divide = findViewById(R.id.buttonDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first + second;
                tvAns.setText("Ans is: " + ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first - second;
                tvAns.setText("Ans is: " + ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first / second;
                tvAns.setText("Ans is: " + ans);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first * second;
                tvAns.setText("Ans is: " + ans);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
