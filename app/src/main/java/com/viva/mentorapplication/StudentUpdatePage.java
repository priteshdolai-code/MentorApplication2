package com.viva.mentorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentUpdatePage extends AppCompatActivity {

    Button update_stu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_update_page);

        update_stu = findViewById(R.id.update_stud);
        update_stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StudentHomePage.class);
                startActivity(intent);
            }
        });

    }
}