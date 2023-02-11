package com.example.hopperhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class min_grade extends AppCompatActivity {

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

        test = findViewById(R.id.gpa_aim);
        test2 = findViewById(R.id.current_average);

        aim_gpa = Integer.parseInt(test.getText().toString());
        current_grade = Integer.parseInt(test.getText().toString());
        min_grade = 2 * aim_gpa - current_grade;

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(String.valueOf(min_grade));
            }
        });


    }


}
