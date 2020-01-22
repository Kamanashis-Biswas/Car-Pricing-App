package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity29_tuyota_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity29_tuyota_cc);

        button1 =(Button) findViewById(R.id.btn_1000c);
        button2 =(Button) findViewById(R.id.btn_1001_1300c);
        button3 =(Button) findViewById(R.id.btn_1301_1500c);
        button4 =(Button) findViewById(R.id.btn_1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity29_tuyota_cc.this,Activity43_toyota_1000cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity29_tuyota_cc.this,Activity44_toyota_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity29_tuyota_cc.this,Activity45_toyota_1500_cc.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity29_tuyota_cc.this,Activity46_toyota_1500pluscc.class);
                startActivity(intent);
            }
        });
    }
}
