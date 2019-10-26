package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView usernameText;
    TextView passwordText;

    int password;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        usernameText=(TextView) findViewById(R.id.text);
        passwordText=(TextView) findViewById(R.id.pass);

        Intent intent=getIntent();

        username=intent.getStringExtra("user");
        password=intent.getIntExtra("pass",5);

        usernameText.setText(username);
        passwordText.setText(password+" ");
    }
}
