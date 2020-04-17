package com.example.projectbaitap;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnChance,btnReset;
    ImageView bai1,bai2,bai3;
    TextView ketqua;
    ArrayList<Integer> laBai = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setBai();
        setEvent();
    }


    private void setControl() {
        bai1 = findViewById(R.id.bai1);
        bai2 = findViewById(R.id.bai2);
        bai3 = findViewById(R.id.bai3);
        btnChance = findViewById(R.id.btnChance);
        btnReset = findViewById(R.id.btnReset);
        ketqua = findViewById(R.id.ketqua);
    }

    private void setBai(){
        laBai.add(R.drawable.d1);
        laBai.add(R.drawable.d2);
        laBai.add(R.drawable.d3);
        laBai.add(R.drawable.d4);
        laBai.add(R.drawable.d5);
        laBai.add(R.drawable.d6);
        laBai.add(R.drawable.d7);
        laBai.add(R.drawable.d8);
        laBai.add(R.drawable.d9);
        laBai.add(R.drawable.d10);
        laBai.add(R.drawable.dj);
        laBai.add(R.drawable.dq);
        laBai.add(R.drawable.dk);
    }

    private void setEvent() {
        btnChance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();
                int batKyOne = rd.nextInt(laBai.size());
                int batKyTwo = rd.nextInt(laBai.size());
                int batKyThree = rd.nextInt(laBai.size());

                bai1.setImageResource(laBai.get(batKyOne));
                bai2.setImageResource(laBai.get(batKyTwo));
                bai3.setImageResource(laBai.get(batKyThree));
                int tong = 0;

                if (batKyOne < 10) {
                    tong += (batKyOne + 1);
                }
                if (batKyTwo < 10) {
                    tong += (batKyTwo + 1);
                }
                if (batKyThree < 10) {
                    tong += (batKyThree + 1);
                }

                ketqua.setText("ket qua :" + tong);
            }

        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bai1.setImageResource(R.drawable.b2fv);
                bai2.setImageResource(R.drawable.b2fv);
                bai3.setImageResource(R.drawable.b2fv);
                ketqua.setText("tran thanh tuan vu ");
            }
        });



    }



}
