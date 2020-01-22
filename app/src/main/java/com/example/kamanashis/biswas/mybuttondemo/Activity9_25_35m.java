package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity9_25_35m extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6,button8,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_25_35m);

        button1 =(Button) findViewById(R.id.btn_toyotaa3);
        button2 =(Button) findViewById(R.id.btn_Maruti3);
        button3 =(Button) findViewById(R.id.btn_mitsubishii3);
        button4 =(Button) findViewById(R.id.btn_hondaa3);
        button5 =(Button) findViewById(R.id.btn_hyundaii3);
        button6 =(Button) findViewById(R.id.btn_kiaa3);
        button8 =(Button) findViewById(R.id.btn_tataa3);
        button11 =(Button) findViewById(R.id.btn_bmww3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });




        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9_25_35m.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });



    }
}
