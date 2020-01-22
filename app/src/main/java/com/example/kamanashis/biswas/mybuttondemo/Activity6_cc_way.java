package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6_cc_way extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity6_cc_way);

        button1 =(Button) findViewById(R.id.btn_c1000c);
        button2 =(Button) findViewById(R.id.btn_c1001_c1300c);
        button3 =(Button) findViewById(R.id.btn_c1301_c1500c);
        button4 =(Button) findViewById(R.id.btn_c1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity6_cc_way.this,Activity67_default_cc1000.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity6_cc_way.this,Activity68_default_cc1300.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity6_cc_way.this,Activity69_default_cc1500.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity6_cc_way.this,Activity70_defaukt_cc1500plus.class);
                startActivity(intent);
            }
        });
    }
}
