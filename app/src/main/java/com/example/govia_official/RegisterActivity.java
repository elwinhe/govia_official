package com.example.govia_official;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    //Variables
    EditText firstNameText, lastNameText, mobileNumber, addressText, countryText, stateText, cityText, zipCode;
    CheckBox noAddress;
    private Button firstButton, nextButton;
    TextView rdloginLink;
    boolean skipAddress = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable assignment
        firstNameText = (EditText) findViewById(R.id.firstNameText);
        lastNameText = (EditText) findViewById(R.id.lastNameText);
        mobileNumber = (EditText) findViewById(R.id.mobileNumber);
        noAddress = (CheckBox) findViewById(R.id.noAddress);
        addressText = (EditText) findViewById(R.id.addressText);
        countryText = (EditText) findViewById(R.id.countryText);
        stateText = (EditText) findViewById(R.id.stateText);
        cityText = (EditText) findViewById(R.id.cityText);
        zipCode = (EditText) findViewById(R.id.zipCode);
        rdloginLink = (TextView) findViewById(R.id.rdLoginLink);
        nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
        rdloginLink.setOnClickListener(this);

        //checkbox boolean for noAddress
        if (noAddress.isChecked()) {
            skipAddress = true;
        }
    }

    @Override
    public void onClick(View v) {
    //Method calls when button is clicked
        switch(v.getId()) {
            //switch statement to determine which button is clicked
            case R.id.nextButton:
                //executes when the next button is clicked
                //temporary, put this line under register button
                String name = firstNameText.getText().toString() + " "  + lastNameText.getText().toString();
                String phone = mobileNumber.getText().toString();
                String address = addressText.getText().toString() + ", " + cityText.getText().toString() + ", " + stateText.getText().toString();
                pageTwo();

                break;

            case R.id.rdLoginLink:
                startActivity(new Intent(this, Login.class));
                //when the login link is clicked
                break;
        }

    }

    private void pageTwo() {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
/*
    //Saves data of page on button click
    public void nextPage(View view) {

        //gets all the values entered
        String firstName = firstNameText.getEditText().getText().toString();
        String lastName = lastNameText.getEditText().getText().toString();
        String phoneNo = mobileNumber.getEditText().getText().toString();
        String addressLine = addressText.getEditText().getText().toString();
        String countryLine = countryText.getEditText().getText().toString();
        String stateLine = stateText.getEditText().getText().toString();
    } */
}