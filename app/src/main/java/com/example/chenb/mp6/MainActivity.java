package com.example.chenb.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.startGame);
        final Button start = findViewById(R.id.start);
        start.setOnClickListener(v -> {
            tv.setText("Game is about to start");
        });

        configureNextButton();

    }

    private void configureNextButton() {
        Button signUpButton = findViewById(R.id.signUp);
        signUpButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, signUpActivity.class));
        });
    }
}


