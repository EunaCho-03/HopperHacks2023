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
    private EditText et_test;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //et_test = findViewById(R.id.et_test);

        avg_gpa = findViewById(R.id.avg_gpa); // xml에 있는 id를 찾아와라 (연결)
        avg_gpa.setOnClickListener(new View.OnClickListener() { // 버튼을 클릭했을때 안쪽 코드를 실행해라
            @Override
            public void onClick(View v) {
               // str = et_test.getText().toString(); // 사용자가 적은 텍스트 데이터값을 str에 넣어준다
                Intent intent = new Intent(MainActivity.this, Avg_gpa.class); // 현재 액치비티에서 이동하고 싶은 액티비티
                intent.putExtra("str",str); // "" 안 str은 별명
                startActivity(intent); // 액티비티 이동시킴
            }
        });

        min_grade = findViewById(R.id.min_grade); // xml에 있는 id를 찾아와라 (연결)
        min_grade.setOnClickListener(new View.OnClickListener() { // 버튼을 클릭했을때 안쪽 코드를 실행해라
            @Override
            public void onClick(View v) {
               // str = et_test.getText().toString(); // 사용자가 적은 텍스트 데이터값을 str에 넣어준다
                Intent intent = new Intent(MainActivity.this, min_grade.class); // 현재 액치비티에서 이동하고 싶은 액티비티
                intent.putExtra("str",str); // "" 안 str은 별명
                startActivity(intent); // 액티비티 이동시킴
            }
        });


    }


}