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
    TextView txtSoLuong, txtPrice, txtSumPrice, txtPriceOrginal;
    int soluong = 1;
    Button btnApDung;
    EditText edtMaGiamGia;
    double discount = 141.8 * 0.1;
    static final double sumPrice = 141.8;

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
        txtSumPrice = findViewById(R.id.txtSumPrice);
        txtPriceOrginal = findViewById(R.id.txtPriceOrginal);

        txtSoLuong.setText(soluong + "");
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soluong = soluong - 1;
                if (soluong < 1) {
                    soluong = 1;
                }
                txtSoLuong.setText(soluong + "");
                txtPrice.setText(String.format("%.2f", (sumPrice * soluong)) + "0 đ");
                txtSumPrice.setText(String.format("%.2f", (sumPrice * soluong)) + "0 đ");
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soluong = soluong + 1;
                txtSoLuong.setText(soluong + "");
                txtPrice.setText(String.format("%.2f", (sumPrice * soluong)) + "0 đ");
                txtSumPrice.setText(String.format("%.2f", (sumPrice * soluong)) + "0 đ");
            }
        });

        btnApDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtMaGiamGia.getText().toString().trim().equals("thoai")) {
//                    String price = txtSumPrice.getText().toString();
//                    double sum = Double.parseDouble(price);
//                    sum = sum - discount;
                    txtSumPrice.setText(String.format("%.2f", (sumPrice * soluong) - discount) + "0 đ");
                } else {
                    Toast.makeText(MainActivity.this, "Mã giảm giá không hợp lệ !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}