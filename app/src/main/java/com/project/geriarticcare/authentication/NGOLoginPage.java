package com.project.geriarticcare.authentication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.project.geriarticcare.R;

public class NGOLoginPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ngo_login);

        final TextView NGORegisterNow = findViewById(R.id.NGORegister);
        final Button loginBtn = findViewById(R.id.NGOLoginButton);
        NGORegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NGOLoginPage.this,NGORegistrationPage.class));
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final TextView NGOemail = findViewById(R.id.ngo_email);
                final TextView NGOpassword = findViewById(R.id.NGOpassword);
                String email = NGOemail.getText().toString();
                String password = NGOpassword.getText().toString();


                Context context = getApplicationContext();
                CharSequence text = "Email:" + email + " ,Password: " + password;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}