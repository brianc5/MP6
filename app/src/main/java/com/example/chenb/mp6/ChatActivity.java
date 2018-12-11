package com.example.chenb.mp6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.*;



public class ChatActivity extends AppCompatActivity {

    private TextView botResponse;
    private RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        configureBackButton();

        final TextView info = findViewById(R.id.info);
        info.setText("name: " + FriendInfoActivity.name + "\nage: " + FriendInfoActivity.age + "\nheight: "
                + FriendInfoActivity.height + "\nweight: " + FriendInfoActivity.weight + "\nfact1: " +
                FriendInfoActivity.fact1 + "\nfact2: " + FriendInfoActivity.fact2 + "\nfact3: " + FriendInfoActivity.fact3);


        botResponse = findViewById(R.id.botResponse);
        final Button updateButton = findViewById(R.id.updateResponse);
        requestQueue = Volley.newRequestQueue(this);
        final EditText userResponse = findViewById(R.id.userResponse);

        updateButton.setOnClickListener(view -> {
            userResponse.getText().clear();
            jsonParse();
        });


    }

    private void jsonParse() {
        String url = "https://api.tronalddump.io/random/quote";

        JsonObjectRequest jor = new JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        String result = response.getString("value");
                        botResponse.setText(result);
                    } catch (Exception e) {

                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
                }
        });

        requestQueue.add(jor);
    }

    private void configureBackButton() {
        Button backButton = findViewById(R.id.goBack);
        backButton.setOnClickListener(view -> {
            finish();
        });
    }
}
