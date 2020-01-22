package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity12_80m_1c extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6,button8,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity12_80m_1c);

        button1 =(Button) findViewById(R.id.btn_toyotaa6);
        button2 =(Button) findViewById(R.id.btn_Maruti6);
        button3 =(Button) findViewById(R.id.btn_mitsubishii6);
        button4 =(Button) findViewById(R.id.btn_hondaa6);
        button5 =(Button) findViewById(R.id.btn_hyundaii6);
        button6 =(Button) findViewById(R.id.btn_kiaa6);
        button8 =(Button) findViewById(R.id.btn_tataa6);
        button11 =(Button) findViewById(R.id.btn_bmww6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });



        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12_80m_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });


    }
}
