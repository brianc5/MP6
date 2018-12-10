package com.example.chenb.mp6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class signUpActivity extends AppCompatActivity {

    String name, password, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinput);

        configureBackButton();


        final EditText nameInput, pwInput, emailInput;
        nameInput = findViewById(R.id.name);
        pwInput = findViewById(R.id.password);
        emailInput = findViewById(R.id.email);

        name = nameInput.getText().toString();
        email = emailInput.getText().toString();
        password = pwInput.getText().toString();
    }

    private void configureBackButton() {
        Button backButton = findViewById(R.id.finishSignup);
        backButton.setOnClickListener(view -> {
            finish();
        });
    }
}
