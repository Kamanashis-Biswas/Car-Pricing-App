package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity39_bmw_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity39_bmw_cc);

        button1 =(Button) findViewById(R.id.btn_bm1000c);
        button2 =(Button) findViewById(R.id.btn_bm1001_bm1300c);
        button3 =(Button) findViewById(R.id.btn_bm1301_bm1500c);
        button4 =(Button) findViewById(R.id.btn_bm1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity39_bmw_cc.this,Activity59_bmw_1000cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity39_bmw_cc.this,Activity60_bmw_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity39_bmw_cc.this,Activity61_bmw_1500cc.class);
                startActivity(intent);
            }
        });

    }
}
