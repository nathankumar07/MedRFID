package com.example.medrfid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PatientHome extends AppCompatActivity {

    private int numAntibodies = 0;
    private String username = "ERROR";
    private TextView welcome;
    private TextView antibodies;
    private Button info;
    private Button message;
    private Button history;
    private ImageView infoIcon;
    private ImageView messageIcon;
    private ImageView historyIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);

        welcome = (TextView) findViewById(R.id.welcome);
        //CODE TO FETCH name of user and store into username
        welcome.setText("Welcome " + username + "!");

        antibodies = (TextView) findViewById(R.id.antibodies);
        //CODE TO FETCH # of antibodies and store into numAntibodies
        antibodies.setText(Integer.toString(numAntibodies));

        info = (Button) findViewById(R.id.info_button);
        message = (Button) findViewById(R.id.message_button);
        history = (Button) findViewById(R.id.history_button);

        infoIcon = (ImageView) findViewById(R.id.info_icon);
        messageIcon = (ImageView) findViewById(R.id.message_icon);
        historyIcon = (ImageView) findViewById(R.id.history_icon);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientHome.this, PatientInfo.class);
                startActivity(intent);
            }
        });

        infoIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientHome.this, PatientInfo.class);
                startActivity(intent);
            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientHome.this, PatientMessage.class);
                startActivity(intent);
            }
        });

        messageIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientHome.this, PatientMessage.class);
                startActivity(intent);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientHome.this, History.class);
                startActivity(intent);
            }
        });

        historyIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientHome.this, History.class);
                startActivity(intent);
            }
        });
    }
}
