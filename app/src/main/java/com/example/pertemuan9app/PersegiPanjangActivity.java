package com.example.pertemuan9app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pertemuan9app.R;

public class PersegiPanjangActivity extends AppCompatActivity{

    EditText tbEditLebar, tbEditPanjang;
    Button btnPersegiPanjang;
    TextView lblKelilingPersegiPanjang, lblLuasPersegiPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        setTitle("Hitung PP");

        tbEditLebar = findViewById(R.id.tbeditlebar);
        tbEditPanjang = findViewById(R.id.tbeditpanjang);
        btnPersegiPanjang = findViewById(R.id.btnhitungpersegi);
        lblKelilingPersegiPanjang = findViewById(R.id.lblkelilingpersegipanjang);
        lblLuasPersegiPanjang = findViewById(R.id.lblluaspersegipanjang);

        //this is the bug!
        //btnPersegiPanjang.setOnClickListener(this);

        //idk why it's a bug thing

        //should create method that called manually from .xml file using onClick attribute
    }

    //get ready to be called
    public void hitungPP(View v) {
        if (tbEditPanjang.getText().toString().length() == 0) {
            //jika kolom masih kosong
            tbEditPanjang.setError("Input panjang dibutuhkan");
        } else {
            int panjang = Integer.valueOf(tbEditPanjang.getText().toString());
            int lebar = Integer.valueOf(tbEditLebar.getText().toString());
            int kelilingpersegipanjangnya = (panjang + lebar) * 2;
            int luaspersegipanjangnya = panjang * lebar;

            lblKelilingPersegiPanjang.setText(String.valueOf(kelilingpersegipanjangnya));
            lblLuasPersegiPanjang.setText(String.valueOf(luaspersegipanjangnya));
            {
                Toast.makeText(getApplicationContext(), "Hitung Berhasil!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}