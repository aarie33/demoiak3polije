package com.moveit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class hewan extends AppCompatActivity {
    EditText etHewan, etNafas;
    RadioButton rbAnak, rbTelur;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        setTitle("Input Hewan");
        etHewan = (EditText) findViewById(R.id.etHewan);
        etNafas = (EditText) findViewById(R.id.etNafas);
        rbAnak = (RadioButton) findViewById(R.id.rbAnak);
        rbTelur = (RadioButton) findViewById(R.id.rbTelur);
        btSubmit = (Button) findViewById(R.id.btSubmit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekKirim();
            }
        });
    }
    private void cekKirim(){
        if (TextUtils.isEmpty(etHewan.getText())){
            Toast.makeText(getApplicationContext(), "Isi Nama Hewan Woyy", Toast.LENGTH_SHORT).show();
            getCurrentFocus();
        } else if (TextUtils.isEmpty(etNafas.getText())){
            Toast.makeText(getApplicationContext(), "Isi Alatnya dulu lahhh", Toast.LENGTH_SHORT).show();
            getCurrentFocus();
        } else if (!rbAnak.isChecked() && !rbTelur.isChecked()){
            Toast.makeText(getApplicationContext(), "Isi Jenisnya dulu lahhh", Toast.LENGTH_SHORT).show();
        } else {
            String jenis;
            if (rbAnak.isChecked()){
                jenis = rbAnak.getText().toString();
            } else {
                jenis = rbTelur.getText().toString();
            }

            Intent i = new Intent(getApplicationContext(), DataHewan.class);
            i.putExtra("hewan", etHewan.getText().toString());
            i.putExtra("nafas", etNafas.getText().toString());
            i.putExtra("jenis", jenis);

            startActivity(i);

        }
    }
}
