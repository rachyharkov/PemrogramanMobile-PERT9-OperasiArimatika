package com.example.pertemuan9app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pertemuan9app.R;
public class PersegiActivity extends AppCompatActivity {

    TextView lblLuasPersegi, lblKelilingPersegi;
    EditText tbeditSisi;
    Button btnHitungPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        setTitle("Hitung Persegi");

        lblKelilingPersegi = findViewById(R.id.lblkelilingpersegi);
        lblLuasPersegi = findViewById(R.id.lblluaspersegi);
        btnHitungPersegi = findViewById(R.id.btnhitungpersegi);
        tbeditSisi = findViewById(R.id.tbeditsisi);

        btnHitungPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sisi = Integer.valueOf(tbeditSisi.getText().toString());
                int keliling = sisi * 4;
                int luas = sisi * sisi;

                lblKelilingPersegi.setText(String.valueOf(keliling));
                lblLuasPersegi.setText(String.valueOf(luas));
            }
        });
    }
}