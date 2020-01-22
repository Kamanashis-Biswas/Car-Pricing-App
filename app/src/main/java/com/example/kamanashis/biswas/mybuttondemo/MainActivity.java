package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


     Button login ;
     EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login =(Button) findViewById(R.id.logInButtonId);
        username =(EditText)findViewById(R.id.logInUserTextId);
        password =(EditText)findViewById(R.id.logInPasswordTextId);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();
            }
        });

    }

    public void login(){
        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("admin")&&pass.equals("12345"));
        {
            Intent intent = new Intent(MainActivity.this,Activity2_login.class);
            startActivity(intent);
        }
    }
}
