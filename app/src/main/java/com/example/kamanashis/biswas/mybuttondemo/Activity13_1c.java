package com.example.kamanashis.biswas.mybuttondemo;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity13_1c extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6,button8,button11;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity13_1c);

        button1 =(Button) findViewById(R.id.btn_toyotaa7);
        button2 =(Button) findViewById(R.id.btn_Maruti7);
        button3 =(Button) findViewById(R.id.btn_mitsubishii7);
        button4 =(Button) findViewById(R.id.btn_hondaa7);
        button5 =(Button) findViewById(R.id.btn_hyundaii7);
        button6 =(Button) findViewById(R.id.btn_kiaa7);
        button8 =(Button) findViewById(R.id.btn_tataa7);
        button11 =(Button) findViewById(R.id.btn_bmww7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });



        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });



        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity13_1c.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });






    }
}
