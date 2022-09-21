package com.project.geriarticcare.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.project.geriarticcare.R;

public class ElderlyRegistrationPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elderly_register);

        final TextView ElderlyLoginNow = findViewById(R.id.ElderlyLoginNow);
        ElderlyLoginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ElderlyRegistrationPage.this, ElderlyLoginPage.class));
            }
        });
    }
}