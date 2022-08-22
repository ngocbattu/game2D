package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image_nha_vat_chinh , image_skin1 ,image_skin2,image_skin3 , image_nhanvat_chinh2,image_akzaz,image_vs , imageMau1,imageMau2;
    Button btn_start,btn_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_nha_vat_chinh = findViewById(R.id.image_nv_chinh);
        image_nhanvat_chinh2 = findViewById(R.id.image_nv_chinh2);
        image_skin1  = findViewById(R.id.image_skin1);
        image_skin2 = findViewById(R.id.image_skin2);
        image_skin3 = findViewById(R.id.imageView3);
        image_akzaz = findViewById(R.id.image_quy);
        image_vs = findViewById(R.id.image_vs);
        imageMau1 = findViewById(R.id.mau1);
        imageMau2 = findViewById(R.id.mau2);
        btn_start = findViewById(R.id.button);

        image_nhanvat_chinh2.setVisibility(View.GONE);
        imageMau1.setVisibility(View.GONE);
        imageMau2.setVisibility(View.GONE);
        image_skin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click chiêu 1", Toast.LENGTH_SHORT).show();
                image_nha_vat_chinh.setVisibility(View.GONE);
                image_nhanvat_chinh2.setImageResource(R.drawable.chieu7);
                image_nhanvat_chinh2.setVisibility(View.VISIBLE);
                image_akzaz.setImageResource(R.drawable.thu);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        image_nha_vat_chinh.setVisibility(View.VISIBLE);
                        image_nhanvat_chinh2.setVisibility(View.GONE);
                        image_akzaz.setImageResource(R.drawable.akaza);
                    }
                },1000);
            }
        });
        image_skin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image_nha_vat_chinh.setVisibility(View.GONE);
                image_nhanvat_chinh2.setImageResource(R.drawable.chieu5);
                image_nhanvat_chinh2.setVisibility(View.VISIBLE);
                image_akzaz.setImageResource(R.drawable.thu);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        image_nha_vat_chinh.setVisibility(View.VISIBLE);
                        image_nha_vat_chinh.setImageResource(R.drawable.nhanvatchinh);
                        image_nhanvat_chinh2.setVisibility(View.GONE);
                        image_akzaz.setImageResource(R.drawable.akaza);
                    }
                },1000);
            }
        });
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageMau1.setVisibility(View.VISIBLE);
                imageMau2.setVisibility(View.VISIBLE);
                image_vs.setVisibility(View.GONE);
                btn_start.setVisibility(View.GONE);
                btn_start.setText("Stop");
            }
        });
        image_skin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image_nha_vat_chinh.setVisibility(View.GONE);
                image_nhanvat_chinh2.setImageResource(R.drawable.chieu6);
                image_nhanvat_chinh2.setVisibility(View.VISIBLE);
                image_akzaz.setImageResource(R.drawable.thu);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        image_nha_vat_chinh.setVisibility(View.VISIBLE);
                        image_nha_vat_chinh.setImageResource(R.drawable.nhanvatchinh);
                        image_nhanvat_chinh2.setVisibility(View.GONE);
                        image_akzaz.setImageResource(R.drawable.akaza);
                    }
                },1000);
            }
        });
    }


}