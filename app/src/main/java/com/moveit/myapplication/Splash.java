package com.moveit.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends Activity {
    TextView text;

    int RUNTIME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        text = (TextView)findViewById(R.id.txtapp);

        text.setText("Kalimat kalimat Kalimat kalimat Kalimat kalimat " +
                "Kalimat kalimatKalimat kalimatKalimat kalimatKalimat " +
                "Kalimat kalimat" +
                "Kalimat kalimat" +
                "Kalimat kalimatKalimat kalimatKalimat kalimatKalimat kalimat" +
                "Kalimat kalimatKalimat kalimat" +
                "Kalimat kalimatKalimat kalimatKalimat kalimat" +
                "Kalimat kalimatKalimat kalimatKalimat kalimat" +
                "Kalimat kalimatKalimat kalimatKalimat kalimat" +
                "Kalimat kalimatKalimat kalimat");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome = new Intent(getApplicationContext(), InputActivity.class);
                startActivity(iHome);
                finish();
            }
        }, RUNTIME);
    }
}
