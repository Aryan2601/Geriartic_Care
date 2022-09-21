package com.project.geriarticcare.loginRegistration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.project.geriarticcare.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ElderlyLoginBtn = findViewById(R.id.ElderlyLogin);
        final Button CaretakerLoginBtn = findViewById(R.id.CaretakerLogin);
        final Button NGOLoginBtn = findViewById(R.id.NGOLogin);

        ElderlyLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ElderlyLoginPage.class));
            }
        });
        CaretakerLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CaretakerLoginPage.class));
            }
        });
        NGOLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NGOLoginPage.class));
            }
        });
    }
}