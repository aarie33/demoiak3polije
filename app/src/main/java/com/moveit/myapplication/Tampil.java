package com.moveit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Tampil extends AppCompatActivity {

    TextView nama, jkel, hobi, makanan;
    String getnama, getjkel, gethobi, getmakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        setTitle("Biodata Diri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nama = (TextView) findViewById(R.id.txtNama);
        jkel = (TextView) findViewById(R.id.txtJkel);
        hobi = (TextView) findViewById(R.id.txtHobi);
        makanan = (TextView) findViewById(R.id.txtHobi);

        //MENANGKAP DATA YANG DIKIRIMKAN INTENT
        getnama = getIntent().getStringExtra("nama");
        getjkel = getIntent().getStringExtra("jkel");
        gethobi = getIntent().getStringExtra("hobi");
        getmakanan = getIntent().getStringExtra("makanan");

        //MENAMPILKAN DATA INTENT KE TEXTVIEW
        nama.setText(getnama);
        jkel.setText(getjkel);
        hobi.setText(gethobi);
        makanan.setText(getmakanan);

        VariableClass.nilai = VariableClass.nilai + 10;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
