package com.example.pertemuan9app;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pertemuan9app.PersegiActivity;
import com.example.pertemuan9app.PersegiPanjangActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPersegi, btnPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Welcome");
        //assigning variable
        btnPersegi = findViewById(R.id.btn_persegi);
        btnPanjang = findViewById(R.id.btn_panjang);

        btnPersegi.setOnClickListener(this);
        btnPanjang.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {
        if (v.getId() == R.id.btn_persegi) {
            startActivity(new Intent(this, PersegiActivity.class));
        } else if (v.getId() == R.id.btn_panjang) {
            startActivity(new Intent(this, PersegiPanjangActivity.class));
        }
    }
}