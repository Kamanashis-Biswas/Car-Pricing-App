package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity36_tata_cc extends AppCompatActivity {

    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity36_tata_cc);

        button1 =(Button) findViewById(R.id.btn_ta1000c);
        button2 =(Button) findViewById(R.id.btn_ta1001_ta1300c);
        button3 =(Button) findViewById(R.id.btn_ta1301_ta1500c);
        button4 =(Button) findViewById(R.id.btn_ta1500c);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity36_tata_cc.this,Activity55_tata_1000cc.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity36_tata_cc.this,Activity57_tata_1300cc.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity36_tata_cc.this,Activity56_tata_1500cc.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity36_tata_cc.this,Activity58_tata_1500pluscc.class);
                startActivity(intent);
            }
        });
    }
}
