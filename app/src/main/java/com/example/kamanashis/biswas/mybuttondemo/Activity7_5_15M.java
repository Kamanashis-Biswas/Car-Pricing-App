package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity7_5_15M extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6,button8,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity7_5_15_m);

        button1 =(Button) findViewById(R.id.btn_toyotaa);
        button2 =(Button) findViewById(R.id.btn_Maruti);
        button3 =(Button) findViewById(R.id.btn_mitsubishii);
        button4 =(Button) findViewById(R.id.btn_hondaa);
        button5 =(Button) findViewById(R.id.btn_hyundaii);
        button6 =(Button) findViewById(R.id.btn_kiaa);
        button8 =(Button) findViewById(R.id.btn_tataa);
        button11 =(Button) findViewById(R.id.btn_bmww);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity29_tuyota_cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity30_Maruti_cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity31_mitsubishi_cc.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity32_honda_cc.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity33_hyundai_cc.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity34_kia_cc.class);
                startActivity(intent);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity36_tata_cc.class);
                startActivity(intent);
            }
        });



        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity7_5_15M.this,Activity39_bmw_cc.class);
                startActivity(intent);
            }
        });



    }
}
