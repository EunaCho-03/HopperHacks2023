package com.example.hopperhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Avg_gpa extends AppCompatActivity {

    private Button calculation;
    private Button reset;

    private TextView resultText;
    private int resultNum = 0;

    private EditText subject1;
    private EditText subject2;
    private EditText subject3;
    private EditText subject4;
    private EditText subject5;
    private EditText grade1;
    private EditText grade2;
    private EditText grade3;
    private EditText grade4;
    private EditText grade5;

    private  int g1;
    private int g2;
    private int g3;
    private int g4;
    private int g5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg_gpa);

        resultText = findViewById(R.id.result_text);
        subject1 = findViewById(R.id.subject1);
        subject2 = findViewById(R.id.subject2);
        subject3 = findViewById(R.id.subject3);
        subject4 = findViewById(R.id.subject4);
        subject5 = findViewById(R.id.subject5);

        grade1 = findViewById(R.id.grade1);
        grade2 = findViewById(R.id.grade2);
        grade3 = findViewById(R.id.grade3);
        grade4 = findViewById(R.id.grade4);
        grade5 = findViewById(R.id.grade5);

        calculation = findViewById(R.id.calculation);
        reset = findViewById(R.id.reset);

        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g1 = Integer.parseInt(grade1.getText().toString());
                g2 = Integer.parseInt(grade2.getText().toString());
                g3 = Integer.parseInt(grade3.getText().toString());
                g4 = Integer.parseInt(grade4.getText().toString());
                g5 = Integer.parseInt(grade5.getText().toString());
                resultNum = (g1 + g2 + g3 + g4 + g5) / 5;

                resultText.setTextColor(0XFF000000);
                resultText = findViewById(R.id.result_text);
                Intent intent = getIntent();

                resultText.setText(String.valueOf(resultNum));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subject1.setText("");
                subject2.setText("");
                subject3.setText("");
                subject4.setText("");
                subject5.setText("");

                grade1.setText("");
                grade2.setText("");
                grade3.setText("");
                grade4.setText("");
                grade5.setText("");

                resultNum = 0;
                resultText.setTextColor(0xFF666666);
                resultText.setText(String.valueOf(resultNum));

                Toast.makeText(getApplicationContext(), "Reset Complete", Toast.LENGTH_SHORT).show();
            }
        });

    }
}




/*
    public void buttonClick(View view) {

        //Button getButton = findViewById(view.getId());

        if(view.getId() == R.id.calculate_button) {
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    g1 = Integer.parseInt(grade1.getText().toString());
                    g2 = Integer.parseInt(grade2.getText().toString());
                    g3 = Integer.parseInt(grade3.getText().toString());
                    g4 = Integer.parseInt(grade4.getText().toString());
                    g5 = Integer.parseInt(grade5.getText().toString());
                    resultNumber = (g1 + g2 + g3 + g4 + g5) / 5;

                    resultText.setTextColor(0XFF000000);
                    resultText = findViewById(R.id.result_text);
                    Intent intent = getIntent();

                    resultText.setText(String.valueOf(resultNumber));
                }
            });
        }

        if (view.getId() == R.id.reset_button) {
            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    subject1.setText("");
                    subject2.setText("");
                    subject3.setText("");
                    subject4.setText("");
                    subject5.setText("");

                    grade1.setText("");
                    grade2.setText("");
                    grade3.setText("");
                    grade4.setText("");
                    grade5.setText("");

                    resultNumber = 0;
                    resultText.setTextColor(0xFF666666);
                    resultText.setText(String.valueOf(resultNumber));

                    Toast.makeText(getApplicationContext(), "Reset Complete", Toast.LENGTH_SHORT).show();
                }
            });
        }

 */

        /*
        if(view.getId() == R.id.calculate_button){

            g1 = Integer.parseInt(grade1.getText().toString());
            g2 = Integer.parseInt(grade2.getText().toString());
            g3 = Integer.parseInt(grade3.getText().toString());
            g4 = Integer.parseInt(grade4.getText().toString());
            g5 = Integer.parseInt(grade5.getText().toString());
            resultNumber = (g1 + g2 + g3 + g4 + g5) / 5;

            resultText.setTextColor(0XFF000000);
            resultText = findViewById(R.id.result_text);
            Intent intent = getIntent();

            resultText.setText(String.valueOf(resultNumber));

        }

        if (view.getId() == R.id.reset_button){
            subject1.setText("");
            subject2.setText("");
            subject3.setText("");
            subject4.setText("");
            subject5.setText("");

            grade1.setText("");
            grade2.setText("");
            grade3.setText("");
            grade4.setText("");
            grade5.setText("");

            resultNumber = 0;
            resultText.setTextColor(0xFF666666);
            resultText.setText(String.valueOf(resultNumber));

            Toast.makeText(getApplicationContext(),"Reset Complete", Toast.LENGTH_SHORT).show();
        }
    }

         */
