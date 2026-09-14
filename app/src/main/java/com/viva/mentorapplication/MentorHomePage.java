package com.viva.mentorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MentorHomePage extends AppCompatActivity {

    Button create_ment_prof;
    Button put_notif;
    Button see_ment_prof;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor_home_page);
        create_ment_prof = findViewById(R.id.ment_prof_cre);
        put_notif = findViewById(R.id.put_notif);
        see_ment_prof = findViewById(R.id.ment_see_prof);

        create_ment_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MentorProfileCreationPage.class);
                startActivity(intent);
            }
        });
        put_notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PutNotification.class);
                startActivity(intent);
            }
        });
        see_ment_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MentorProfilePage.class);
                startActivity(intent);
            }
        });
    }
}