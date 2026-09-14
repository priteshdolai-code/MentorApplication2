package com.viva.mentorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RolePage extends AppCompatActivity {

    Button ment_hd_role;
    Button ment_role;
    Button mentee_role;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_page);

        ment_hd_role = findViewById(R.id.ment_hd_role);
        ment_role = findViewById(R.id.ment_role);
        mentee_role = findViewById(R.id.mentee_role);
        ment_hd_role.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MentorHeadHomePage.class);
                startActivity(intent);
            }
        });
        ment_role.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MentorHomePage.class);
                startActivity(intent);

            }
        });
        mentee_role.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),StudentHomePage.class);
                startActivity(intent);

            }
        });
    }
}