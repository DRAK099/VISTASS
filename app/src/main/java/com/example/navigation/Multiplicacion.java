package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacion extends AppCompatActivity {

    Button operar;

    Button volver;

    private EditText num1;

    private EditText num2;

    private TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
        num1=findViewById(R.id.num1RES);
        num2=findViewById(R.id.num2RES);
        resultado=findViewById(R.id.resulRES);
        operar=findViewById(R.id.botSUM);
        volver=findViewById(R.id.but_volDIV);
        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num3 = Integer.parseInt(num1.getText().toString());
                int num4 = Integer.parseInt(num2.getText().toString());
                int resultado1 = num3 * num4;
                resultado.setText(String.valueOf(resultado1));
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarPantalla();
            }
        });
    }
    void cambiarPantalla(){
        Intent n3 = new Intent(Multiplicacion.this,MainActivity.class);
        startActivity(n3);
    }
}