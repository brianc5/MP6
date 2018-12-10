package com.example.chenb.mp6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FriendInfoActivity extends AppCompatActivity {
    static public String age = "";
    static public String weight = "";
    static public String height = "";
    static public String name = "";
    static public String fact1 = "";
    static public String fact2 = "";
    static public String fact3 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendinfo);

        configureBackButton();
        configureNextButton();

        final EditText ageInput, heightInput, weightInput, nameInput, fact1Input, fact2Input, fact3Input;
        nameInput = findViewById(R.id.name);
        ageInput = findViewById(R.id.age);
        heightInput = findViewById(R.id.height);
        weightInput = findViewById(R.id.weight);
        fact1Input = findViewById(R.id.fact1);
        fact2Input = findViewById(R.id.fact2);
        fact3Input = findViewById(R.id.fact3);

        Button submitInfoButton = findViewById(R.id.submitInfo);
        submitInfoButton.setOnClickListener(view -> {
            name = nameInput.getText().toString();
            age = ageInput.getText().toString();
            height = heightInput.getText().toString();
            weight = weightInput.getText().toString();
            fact1 = fact1Input.getText().toString();
            fact2 = fact2Input.getText().toString();
            fact3 = fact3Input.getText().toString();

        });
    }

    private void configureNextButton() {
        Button mfButton = findViewById(R.id.startChat);
        mfButton.setOnClickListener(view -> {


            startActivity(new Intent(FriendInfoActivity.this, ChatActivity.class));
        });
    }

    private void configureBackButton() {
        Button backButton = findViewById(R.id.backHome);
        backButton.setOnClickListener(view -> {
            finish();
        });
    }


}
