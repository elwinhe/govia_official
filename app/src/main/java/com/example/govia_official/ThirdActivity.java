package com.example.govia_official;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private Button fourthButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond);

        fourthButton = (Button) findViewById(R.id.nextButton2);
        backButton = (Button) findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        fourthButton.setOnClickListener(new View.OnClickListener() {
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
