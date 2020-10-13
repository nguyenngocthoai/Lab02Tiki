package com.snowdrop.lab02tiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btnCong, btnTru;
    TextView txtSoLuong, txtPrice, txtSUmPrice, txtPriceOrginal;
    int soluong = 1;
    Button btnApDung;
    EditText edtMaGiamGia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        txtSoLuong = findViewById(R.id.txtSoLuong);
        edtMaGiamGia = findViewById(R.id.edtMaGiamGia);
        btnApDung = findViewById(R.id.btnApDung);
        txtPrice = findViewById(R.id.txtPrice);
        txtSUmPrice = findViewById(R.id.txtSumPrice);
        txtPriceOrginal = findViewById(R.id.txtPriceOrginal);

        txtSoLuong.setText(soluong + "");
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "clicked -", Toast.LENGTH_SHORT).show();
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
//                Toast.makeText(MainActivity.this, "clicked+", Toast.LENGTH_SHORT).show();
                soluong = soluong + 1;
                txtSoLuong.setText(soluong + "");
            }
        });

        btnApDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtMaGiamGia.getText().toString().trim().equals("thoai")) {
//                    Toast.makeText(MainActivity.this, edtMaGiamGia.getText().toString().trim(), Toast.LENGTH_SHORT).show();
                    txtSUmPrice.setText("100.000 đ");
                    txtPrice.setText("100.000 đ");
//                    txtPriceOrginal.setText("100.000 đ");
                } else {
//                    Toast.makeText(MainActivity.this, "Mã giảm giá không hợp lệ !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}