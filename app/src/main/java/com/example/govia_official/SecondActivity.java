package com.example.govia_official;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button thirdButton;
    private Button backButton;
    EditText email, password;
    DatePicker dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond);

        //variable assignment
        email = (EditText) findViewById(R.id.emailAddress);
        password = (EditText) findViewById(R.id.lastNameText);
        thirdButton = (Button) findViewById(R.id.nextButton2);
        backButton = (Button) findViewById(R.id.backButton);
        dob = (DatePicker) findViewById(R.id.datePicker1);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //back to main
                finish();
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nextPage();
            }
        });
    }


    private void nextPage() {
        Intent i = new Intent(this, ThirdActivity.class);
        startActivity(i);
    }
}