package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity10_35_50m extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6,button8,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10_35_50m);

        button1 =(Button) findViewById(R.id.btn_toyotaa4);
        button2 =(Button) findViewById(R.id.btn_Maruti4);
        button3 =(Button) findViewById(R.id.btn_mitsubishii4);
        button4 =(Button) findViewById(R.id.btn_hondaa4);
        button5 =(Button) findViewById(R.id.btn_hyundaii4);
        button6 =(Button) findViewById(R.id.btn_kiaa4);
        button8 =(Button) findViewById(R.id.btn_tataa4);
        button11 =(Button) findViewById(R.id.btn_bmww4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });



        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });



        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity10_35_50m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });




    }
}
