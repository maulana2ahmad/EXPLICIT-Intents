package com.mractiveiddev.explicitintentsvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvWelcome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvWelcome2 = findViewById(R.id.tvWelcome2);

        String name = getIntent().getStringExtra("name");

        tvWelcome2.setText(name + ", Welcome to Activity 2");
    }
}
