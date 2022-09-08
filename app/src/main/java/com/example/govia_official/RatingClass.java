package com.example.govia_official;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RatingClass extends AppCompatActivity implements View.OnClickListener {

    Button button;
    RatingBar ratingBar;


    @Override
    protected void onCreate(View view) {
        setContentView(R.layout.activity_rating);
    }
}
