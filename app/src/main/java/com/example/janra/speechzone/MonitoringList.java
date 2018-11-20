package com.example.janra.speechzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MonitoringList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitoring_list);
        Toast.makeText(this, "Welcome to Speech Zone", Toast.LENGTH_SHORT).show();
    }

    public void backMain(View v){
        Intent i = new Intent(this, MainScreen.class);
        startActivity(i);
    }
}
