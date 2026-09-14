package com.viva.mentorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MentorHeadHomePage extends AppCompatActivity {

    Button stu_btn;
    Button ment_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor_head_home_page);

        stu_btn = findViewById(R.id.stu_hm_pg);
        ment_btn = findViewById(R.id.ment_hm_pg);

        stu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),StudentHomePage.class);
                startActivity(intent);
            }
        });
        ment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MentorHomePage.class);
                startActivity(intent);
            }
        });
    }
}