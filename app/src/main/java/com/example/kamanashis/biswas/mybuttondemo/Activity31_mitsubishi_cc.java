package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity31_mitsubishi_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity31_mitsubishi_cc);

        button1 =(Button) findViewById(R.id.btn_ms1000c);
        button2 =(Button) findViewById(R.id.btn_ms1001_ms1300c);
        button3 =(Button) findViewById(R.id.btn_ms1301_ms1500c);
        button4 =(Button) findViewById(R.id.btn_ms1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity31_mitsubishi_cc.this,Activity71_mitsubishi_1000cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity31_mitsubishi_cc.this,Activity72_mitsubishi_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity31_mitsubishi_cc.this,Activity73_mitsubishi_1500cc.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity31_mitsubishi_cc.this,Activity74_mitsubishi1500pluscc.class);
                startActivity(intent);
            }
        });
    }
}
