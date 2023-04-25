package com.example.navigation;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
private EditText etUsuario,etPassword;
    Button mapa;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapa = findViewById(R.id.but_Maps);

        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Maps();
            }
        });
    }


    void Maps(){
        Intent map = new Intent( MainActivity.this,MapsActivity.class);
        startActivity(map);
    }

}