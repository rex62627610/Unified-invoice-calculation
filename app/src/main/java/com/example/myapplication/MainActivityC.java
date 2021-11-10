package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityC extends AppCompatActivity {
    int mmm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c);

        TextView mes2 = findViewById(R.id.textView3);
        Intent intent = getIntent();
        String mes3 = intent.getStringExtra("mes2");
        int month = intent.getIntExtra("month1" , 0);
        mmm = month;
        mes2.setText(mes3);
    }

    public void c_to_b(View view){
        Intent intent1 = new Intent(MainActivityC.this, MainActivityB.class);
        intent1.putExtra("month" , mmm);
        startActivity(intent1);
        this.finish();
    }
    public void c_to_a(View view){
        Intent intent = new Intent(MainActivityC.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}