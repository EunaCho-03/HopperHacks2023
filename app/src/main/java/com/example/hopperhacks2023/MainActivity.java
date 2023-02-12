package com.example.hopperhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button avg_gpa;
    private Button min_grade;
    private Button test;
    private EditText et_test;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avg_gpa = findViewById(R.id.avg_gpa);
        avg_gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Avg_gpa.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });

        min_grade = findViewById(R.id.min_grade);
        min_grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, min_grade.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });

    }


}