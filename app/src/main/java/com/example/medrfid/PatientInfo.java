package com.example.medrfid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PatientInfo extends AppCompatActivity {

    private ImageView supportIcon;
    private TextView supportText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_info);

        supportIcon = (ImageView) findViewById(R.id.b2);
        supportText = (TextView) findViewById(R.id.btext2);

        supportIcon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.cancer.gov/about-cancer/coping"));
                startActivity(browserIntent);
            }
        });

        supportText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.cancer.gov/about-cancer/coping"));
                startActivity(browserIntent);
            }
        });;
    }
}
