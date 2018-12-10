package com.example.chenb.mp6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        configureBackButton();

        final TextView info = findViewById(R.id.info);
        info.setText("name: " + FriendInfoActivity.name + "\nage: " + FriendInfoActivity.age + "\nheight: "
                + FriendInfoActivity.height + "\nweight: " + FriendInfoActivity.weight + "\nfact1: " +
                FriendInfoActivity.fact1 + "\nfact2: " + FriendInfoActivity.fact2 + "\nfact3: " + FriendInfoActivity.fact3);
    }

    private void configureBackButton() {
        Button backButton = findViewById(R.id.goBack);
        backButton.setOnClickListener(view -> {
            finish();
        });
    }
}
