package com.mractiveiddev.explicitintentsvideo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    EditText etUsername;
    Button btnSubmit, btnCancele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        etUsername = findViewById(R.id.etUsername);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancele = findViewById(R.id.btnCalcele);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUsername.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity3.this, "Please enter all filed", Toast.LENGTH_LONG).show();
                }
                else
                {
                    String username = etUsername.getText().toString().trim();

                    Intent intent = new Intent();
                    intent.putExtra("username", username);
                    setResult(RESULT_OK, intent);
                    Activity3.this.finish();
                }
            }
        });

        //menggunakan cancele button juga sama saja dari cancele back di MainActivity
        btnCancele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                Activity3.this.finish();
            }
        });

    }
}
