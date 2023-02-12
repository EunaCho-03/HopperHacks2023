package com.example.hopperhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class min_grade extends AppCompatActivity {
/*
    private Button calculate;
    private int aim_gpa = 0;
    private EditText test;
    private int current_grade = 0;
    private EditText test2;
    private int min_grade = 0;

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_grade);

        //test = findViewById(R.id.gpa_aim);
        //test2 = findViewById(R.id.current_average);

        aim_gpa = Integer.parseInt(test.getText().toString());
        current_grade = Integer.parseInt(test.getText().toString());
        min_grade = 2 * aim_gpa - current_grade;

        calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(String.valueOf(min_grade));
            }
        });


    }

 */

/*
    private Button calculate;
    private int aim_gpa = 0;
    private EditText test;
    private int current_grade = 0;
    private EditText test2;
    private int min_grade = 0;
    int resultNumber = 0;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_grade);
        result = findViewById(R.id.result);
        Intent intent = getIntent();

        result.setText(String.valueOf(resultNumber));
    }
 */

    private Button calculate;
    private int aim_gpa = 0;
    private EditText gpa_aim;
    private int current_grade = 0;
    private EditText current_avg;
    private int min_grade = 0;
    int resultNumber = 0;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_grade);

        gpa_aim = findViewById(R.id.gpa_aim);
        current_avg = findViewById(R.id.current_avg);

        calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aim_gpa = Integer.parseInt(gpa_aim.getText().toString());
                current_grade = Integer.parseInt(current_avg.getText().toString());

                result = findViewById(R.id.result);
                Intent intent = getIntent();

                result.setText(String.valueOf(resultNumber));
            }
        });
    }
}

