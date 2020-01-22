package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity34_kia_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity34_kia_cc);


        button1 =(Button) findViewById(R.id.btn_kk1000c);
        button2 =(Button) findViewById(R.id.btn_kk1001_kk1300c);
        button3 =(Button) findViewById(R.id.btn_kk1301_kk1500c);
        button4 =(Button) findViewById(R.id.btn_kk1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity34_kia_cc.this,Activity75_kia_1000_cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity34_kia_cc.this,Activity76_kia_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity34_kia_cc.this,Activity77_kia_1500cc.class);
                startActivity(intent);
            }
        });
    }
}
