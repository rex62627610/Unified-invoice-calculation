package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void number1(View view){
        TextView choose = findViewById(R.id.textView);
        choose.setText("1,2月");
        number = 1;
    }
    public void number2(View view){
        TextView choose = findViewById(R.id.textView);
        choose.setText("3,4月");
        number = 2;
    }
    public void number3(View view){
        TextView choose = findViewById(R.id.textView);
        choose.setText("5,6月");
        number = 3;
    }
    public void number4(View view){
        TextView choose = findViewById(R.id.textView);
        choose.setText("7,8月");
        number = 4;
    }
    public void number5(View view){
        TextView choose = findViewById(R.id.textView);
        choose.setText("9,10月");
        number = 5;
    }
    public void number6(View view){
        TextView choose = findViewById(R.id.textView);
        choose.setText("11,12月");
        number = 6;
    }

    public void a_to_b(View view){
        if (number != 0){
            Intent intent1 = new Intent(MainActivity.this, MainActivityB.class);
            intent1.putExtra("month", number);
            startActivity(intent1);
            this.finish();
        }else {
            TextView mmm = findViewById(R.id.textView);
            mmm.setText("請選擇月份");
        }
    }
}