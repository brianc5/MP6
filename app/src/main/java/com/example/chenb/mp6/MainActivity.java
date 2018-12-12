package com.example.chenb.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button exitButton = findViewById(R.id.exit);
        exitButton.setOnClickListener(view -> {
            finish();
        });

        configureNextButton();

    }

    private void configureNextButton() {
        Button mfButton = findViewById(R.id.makeFriend);
        mfButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FriendInfoActivity.class));
        });
    }
}


