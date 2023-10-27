package com.example.andronddemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView results;
    private Button button, button2, button3, button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.editTextTextPersonName2);
        TextView results = findViewById(R.id.results);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(num1.getText().toString());
                int n2= Integer.parseInt(num2.getText().toString());
                int sum = n1+n2;
                results.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Sum is "+ sum, Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(num1.getText().toString());
                int n2= Integer.parseInt(num2.getText().toString());
                int sum = n1 - n2;
                results.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Subtraction is "+ sum, Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(num1.getText().toString());
                int n2= Integer.parseInt(num2.getText().toString());
                int sum = n1 / n2;
                results.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Divide is "+ sum, Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(num1.getText().toString());
                int n2= Integer.parseInt(num2.getText().toString());
                int sum = n1 * n2;
                results.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "Multiplication is "+ sum, Toast.LENGTH_SHORT).show();
            }
        });
    }
}