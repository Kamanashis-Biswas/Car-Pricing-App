package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5_brand_way extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6,button8,button11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_brand_way);

        button1 =(Button) findViewById(R.id.btn_toyota);
        button2 =(Button) findViewById(R.id.btn_Maruti);
        button3 =(Button) findViewById(R.id.btn_mitsubishi);
        button4 =(Button) findViewById(R.id.btn_honda);
        button5 =(Button) findViewById(R.id.btn_hyundai);
        button6 =(Button) findViewById(R.id.btn_kia);
        button8 =(Button) findViewById(R.id.btn_tata);
        button11 =(Button) findViewById(R.id.btn_bmw);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity14_definition_of_toyota.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity20_definition_of_Maruti.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity21_definition_of_mitsubishi.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity15_definition_of_honda.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity22_definition_of_hyundai.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity23_definition_of_kia.class);
                startActivity(intent);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity25_definition_of_tata.class);
                startActivity(intent);
            }
        });



        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5_brand_way.this,Activity16_definition_of_bmw.class);
                startActivity(intent);
            }
        });

    }
}
