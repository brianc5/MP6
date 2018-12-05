package com.example.chenb.mp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String name, password, email;
    EditText nameInput, pwInput, emailInput;
    final Button submitButton= findViewById(R.id.finishSignup);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.startGame);
        final Button start = findViewById(R.id.start);
        start.setOnClickListener(v -> {
            tv.setText("Game is about to start");
        });

        final Button signUpB = findViewById(R.id.signUp);
        signUpB.setOnClickListener(v -> {
            setContentView(R.layout.user_input);
        });

        final Button returnToMain = findViewById(R.id.finishSignup);
        returnToMain.setOnClickListener(v -> {
            setContentView(R.layout.activity_main);
        });

        nameInput = findViewById(R.id.name);
        pwInput = findViewById(R.id.password);
        emailInput = findViewById(R.id.email);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                password = pwInput.getText().toString();
            }
        });
    }
}


