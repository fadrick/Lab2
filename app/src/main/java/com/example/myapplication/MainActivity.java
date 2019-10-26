package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username,pass;
    Button submit;
    String mUser;
    int mPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.username);
        submit=(Button) findViewById(R.id.button);
        pass=(EditText) findViewById(R.id.password);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mUser=username.getText().toString();
                mPass=Integer.parseInt(pass.getText().toString());

                Intent intent=new Intent(MainActivity.this, second.class);
                intent.putExtra("user",mUser);
                intent.putExtra("pass",mPass);
                startActivity(intent);

            }
        });
    }
}
