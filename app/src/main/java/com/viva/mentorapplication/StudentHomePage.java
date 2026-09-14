package com.viva.mentorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentHomePage extends AppCompatActivity {

    Button creat_stu_prof;
    Button see_stu_prof;

    Button notif_btn;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home_page);

        creat_stu_prof = findViewById(R.id.creat_stu_prof_pg);
        see_stu_prof = findViewById(R.id.see_stu_prof);
        notif_btn = findViewById(R.id.notif_btn);
        //notif_img = findViewById(R.id.notif_img);

        creat_stu_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),CreateProfilePage.class);
                startActivity(intent);
            }
        });
        see_stu_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StudentProfilePage.class);
                startActivity(intent);
            }
        });
        notif_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Notification.class);
                startActivity(intent);
            }
        });
    }
}