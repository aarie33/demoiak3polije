package com.moveit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DataHewan extends AppCompatActivity {

    TextView txHewan, txNafas, txJenis;
    String getHewan, getNafas, getJenis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_hewan);

        setTitle("Data Hewan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txHewan = (TextView) findViewById(R.id.txHewan);
        txNafas = (TextView) findViewById(R.id.txNafas);
        txJenis = (TextView) findViewById(R.id.txJenis);

        getHewan = getIntent().getStringExtra("hewan");
        getNafas = getIntent().getStringExtra("nafas");
        getJenis = getIntent().getStringExtra("jenis");

        txHewan.setText(getHewan);
        txNafas.setText(getNafas);
        txJenis.setText(getJenis);
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
