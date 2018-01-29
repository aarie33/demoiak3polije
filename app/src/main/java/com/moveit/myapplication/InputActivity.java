package com.moveit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {

    EditText nama, hobi, makanan;
    Button submit;
    RadioButton laki, perempuan;
    CheckBox setuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        setTitle("Input Form");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nama = (EditText) findViewById(R.id.edtNama);
        hobi = (EditText) findViewById(R.id.edtHobi);
        makanan = (EditText) findViewById(R.id.edtMakanan);
        submit = (Button) findViewById(R.id.btnSubmit);
        laki = (RadioButton) findViewById(R.id.rdLaki);
        perempuan = (RadioButton) findViewById(R.id.rdPerempuan);
        setuju = (CheckBox) findViewById(R.id.cbSetuju);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekForm();
            }
        });
    }

    private void cekForm(){ //fungsi untuk mengecek inputan
        if (TextUtils.isEmpty(nama.getText())) {
            Toast.makeText(getApplicationContext(),
                    "Harap isikan nama terlebih dahulu", Toast.LENGTH_SHORT).show();
            nama.requestFocus();
        }else if(!laki.isChecked() && !perempuan.isChecked()){
            Toast.makeText(getApplicationContext(),
                    "Harap pilih jenis kelamin", Toast.LENGTH_SHORT).show();
        }else if(TextUtils.isEmpty(hobi.getText())){
            Toast.makeText(getApplicationContext(),
                    "Harap isikan hobi terlebih dahulu", Toast.LENGTH_SHORT).show();
            hobi.requestFocus();
        }else if(TextUtils.isEmpty(makanan.getText())) {
            Toast.makeText(getApplicationContext(),
                    "Harap isikan makanan telebih dahulu", Toast.LENGTH_SHORT).show();
            makanan.requestFocus();
        }else if(!setuju.isChecked()){
            Toast.makeText(getApplicationContext(),
                    "Harap centang persetujuan", Toast.LENGTH_SHORT).show();
        }else{
            String jkel;
            if (laki.isChecked()){
                jkel = laki.getText().toString();
            }else{
                jkel = perempuan.getText().toString();
            }

//            Toast.makeText(getApplicationContext(),
//                    nama.getText().toString() + "\n" + jkel + "\n" +
//                    hobi.getText().toString() + "\n" +
//                    makanan.getText().toString(), Toast.LENGTH_SHORT).show();


//            Intent iTampil = new Intent(InputActivity.this, Tampil.class);
            Intent iTampil = new Intent(getApplicationContext(), Tampil.class); //menentukan activity tujuan
            iTampil.putExtra("nama", nama.getText().toString()); //mengirimkan data bernama nama
            iTampil.putExtra("jkel", jkel); //mengirimkan data bernama jkel
            iTampil.putExtra("hobi", hobi.getText().toString()); //mengirimkan data bernama hobi
            iTampil.putExtra("makanan", makanan.getText().toString()); //mengirimkan data bernama makanan

            startActivity(iTampil);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(), "Anda kembali ke Activity Input",
                Toast.LENGTH_SHORT).show();
        super.onResume();
    }
}
