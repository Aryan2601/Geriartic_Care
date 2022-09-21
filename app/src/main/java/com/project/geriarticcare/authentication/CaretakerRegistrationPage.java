package com.project.geriarticcare.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.project.geriarticcare.R;

public class CaretakerRegistrationPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caretaker_register);

        final TextView CaretakerLoginNow = findViewById(R.id.caretakerLoginNow);
        CaretakerLoginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CaretakerRegistrationPage.this, CaretakerLoginPage.class));
            }
        });
    }
}