package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity30_Maruti_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity30__maruti_cc);

        button1 =(Button) findViewById(R.id.btn_m1000c);
        button2 =(Button) findViewById(R.id.btn_m1001_m1300c);
        button3 =(Button) findViewById(R.id.btn_m1301_m1500c);
        button4 =(Button) findViewById(R.id.btn_m1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity30_Maruti_cc.this,Activity47_maruti_1000cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity30_Maruti_cc.this,Activity48_maruti_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity30_Maruti_cc.this,Activity49_maruti_1500cc.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity30_Maruti_cc.this,Activity50_maruti_15000cc.class);
                startActivity(intent);
            }
        });


    }
}
