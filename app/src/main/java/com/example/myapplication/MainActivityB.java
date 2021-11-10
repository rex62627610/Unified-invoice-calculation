package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityB extends AppCompatActivity {
    ArrayList<Integer> number = new ArrayList<Integer>();
    //int mes = Integer.parseInt(mes1.getText().toString());
    int mmm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        Intent intent1 = getIntent();
        int month1 = intent1.getIntExtra("month",0);
        mmm = month1;
        switch (month1){
            case 1:
                //number = new int[]{65209 , 39340 , 1612 , 9999591 , 9999342};
                number.clear();
                number.add(65209);
                number.add(39340);
                number.add(1612);
                number.add(591);
                number.add(342);
                break;
            case 2:
                //number = new int[]{22639 , 86238 , 4837 , 9999991 , 9999715};
                number.clear();
                number.add(22639);
                number.add(86238);
                number.add(4837);
                number.add(991);
                number.add(715);
                break;
            case 3:
                //number = new int[]{40109 , 23535 , 49847 , 9999706 , 9999574};
                number.clear();
                number.add(40109);
                number.add(23535);
                number.add(49847);
                number.add(706);
                number.add(574);
                break;
            case 4:
                //number = new int[]{3003 , 28722 , 70598 , 9999163 , 9999983 , 9999814};
                number.clear();
                number.add(3003);
                number.add(28722);
                number.add(70598);
                number.add(163);
                number.add(983);
                number.add(814);
                break;
            case 5:
                //number = new int[]{45865 , 29035 , 84442 , 9999292 , 9999650 , 9999230};
                number.clear();
                number.add(45865);
                number.add(29035);
                number.add(84442);
                number.add(292);
                number.add(650);
                number.add(230);
                break;
            case 6:
                //number = new int[]{13656 , 50862 , 72404 , 9999185 , 9999079 , 9999442};
                number.clear();
                number.add(13656);
                number.add(50862);
                number.add(72404);
                number.add(185);
                number.add(79);
                number.add(442);
                break;
        }
    }
    public void b_to_c(View view){
        TextView TV = findViewById(R.id.textView2);
        try {
            EditText mes = findViewById(R.id.editTextNumber);
            int inp = Integer.parseInt(mes.getText().toString());
            String mes2 = new String();
            for (int i = 0 ; i < number.size() ; i++){
                if ((number.get(i)%1000) == (inp%1000)){
                    if((number.get(i)%10000) == (inp%10000) && inp > 1000){
                        if (number.get(i) == inp){
                            mes2 = ("恭喜中獎 獎金4000元");
                            break;
                        }else {
                            mes2 = ("恭喜中獎 獎金1000元");
                            break;
                        }
                    }else {
                        mes2 = ("恭喜中獎 獎金200元");
                        break;
                    }
                }else {
                    mes2 = ("再接再厲");
                }
            }
            Intent intent = new Intent(MainActivityB.this, MainActivityC.class);
            intent.putExtra("month1" , mmm);
            intent.putExtra("mes2", mes2);
            startActivity(intent);
            this.finish();
        }catch (Exception e){
            TV.setText("請重新出入發票號碼");
        }
    }
}