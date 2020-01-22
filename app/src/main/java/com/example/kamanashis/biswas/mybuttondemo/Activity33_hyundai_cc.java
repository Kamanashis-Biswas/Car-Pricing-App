package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity33_hyundai_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity33_hyundai_cc);

        button1 =(Button) findViewById(R.id.btn_hu1000c);
        button2 =(Button) findViewById(R.id.btn_hu1001_hu1300c);
        button3 =(Button) findViewById(R.id.btn_hu1301_hu1500c);
        button4 =(Button) findViewById(R.id.btn_hu1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity33_hyundai_cc.this,Activity63_hyundai_1000cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity33_hyundai_cc.this,Activity64_hundai_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity33_hyundai_cc.this,Activity65_hundai_1500cc.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity33_hyundai_cc.this,Activity66_hundai_1500pluscc.class);
                startActivity(intent);
            }
        });
    }
}
