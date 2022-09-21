package com.project.geriarticcare.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.geriarticcare.R;
import com.project.geriarticcare.medicine.MedicineActivity;

public class ElderlyLoginPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elderly_login);

        final Button LoginBtn = findViewById(R.id.elderlyLoginButton);

        final TextView ElderlyRegisterNow = findViewById(R.id.ElderlyRegister);
        ElderlyRegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ElderlyLoginPage.this,ElderlyRegistrationPage.class));
            }
        });

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ElderlyLoginPage.this, MedicineActivity.class));
            }
        });

    }
}