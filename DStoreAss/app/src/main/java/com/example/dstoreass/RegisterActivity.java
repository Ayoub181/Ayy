package com.example.dstoreass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText name,regNo,phone,course,email,password2;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        name = findViewById(R.id.name);
        regNo = findViewById(R.id.regNo);
        phone = findViewById(R.id.phone);
        course = findViewById(R.id.course);
        email = findViewById(R.id.email);
        password2 = findViewById(R.id.pass2);
        save = findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}