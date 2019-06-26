package com.example.medrfid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PatientHome extends AppCompatActivity {

    private int numAntibodies = 0;
    private String username = "ERROR";
    private TextView welcome;
    private TextView antibodies;
    private CardView info;
    private CardView message;
    private CardView history;

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

        info = (CardView) findViewById(R.id.info_card);
        message = (CardView) findViewById(R.id.message_card);
        history = (CardView) findViewById(R.id.history_card);

        info.setOnClickListener(new View.OnClickListener() {
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

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PatientHome.this, History.class);
                startActivity(intent);
            }
        });
    }
}
