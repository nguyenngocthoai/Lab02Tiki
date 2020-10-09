package com.snowdrop.lab02tiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton btnCong, btnTru;
    TextView txtSoLuong;
    int soluong = 1;
    Button btnApDung;
    EditText editMaGiamGia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        txtSoLuong=findViewById(R.id.txtSoLuong);
        editMaGiamGia=findViewById(R.id.edtMaGiamGia);

        txtSoLuong.setText(soluong + "");
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soluong = soluong - 1;
                if (soluong < 1) {
                    soluong = 1;
                }
                txtSoLuong.setText(soluong + "");
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soluong = soluong + 1;
                txtSoLuong.setText(soluong + "");
            }
        });

        btnApDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}