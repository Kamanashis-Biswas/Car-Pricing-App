package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity32_honda_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity32_honda_cc);

        button1 =(Button) findViewById(R.id.btn_h1000c);
        button2 =(Button) findViewById(R.id.btn_h1001_h1300c);
        button3 =(Button) findViewById(R.id.btn_h1301_h1500c);
        button4 =(Button) findViewById(R.id.btn_h1500c);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity32_honda_cc.this,Activity51_honda_1000cc.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity32_honda_cc.this,Activity52_honada_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity32_honda_cc.this,Activity53_honda_1500cc.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity32_honda_cc.this,Activity54_honda_1500pluscc.class);
                startActivity(intent);
            }
        });
    }
}
