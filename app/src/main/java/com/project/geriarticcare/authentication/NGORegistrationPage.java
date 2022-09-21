package com.project.geriarticcare.authentication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.project.geriarticcare.R;

public class NGORegistrationPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_register);

        final EditText NGO_FullName = findViewById(R.id.NGOfullname);
        final EditText description = findViewById(R.id.description_ngo);
        final EditText NGOemail = findViewById(R.id.NGOemail);
        final EditText NGOcontact = findViewById(R.id.NGOcontact);
        final EditText NGOlocation = findViewById(R.id.NGOlocation);
        final EditText NGOpassword = findViewById(R.id.NGOpassword);
        final EditText NGOconfirmpassword = findViewById(R.id.NGOconfirmpassword);
        final Button RegisterBtn = findViewById(R.id.NGORegisterBtn);

        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String fullname = NGO_FullName.getText().toString();
                final String desc = description.getText().toString();
                final String email = NGOemail.getText().toString();
                final String contact = NGOcontact.getText().toString();
                final String location = NGOlocation.getText().toString();
                final String password = NGOpassword.getText().toString();
                final String confirmpassword = NGOconfirmpassword.getText().toString();

                if (fullname.isEmpty() || desc.isEmpty()||email.isEmpty()||contact.isEmpty()||location.isEmpty()||password.isEmpty()||confirmpassword.isEmpty()){
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter all the details";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(!password.equals(confirmpassword)){
                    Context context = getApplicationContext();
                    CharSequence text = "Passwords are not matching";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        final TextView NGOLoginNow = findViewById(R.id.NGOLoginNow);
        NGOLoginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NGORegistrationPage.this, NGOLoginPage.class));
            }
        });
    }
}