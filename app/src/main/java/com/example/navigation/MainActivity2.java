package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button  botonVol;

    Button operar;

    private EditText num1;

    private EditText num2;

    private TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.num1=findViewById(R.id.num1RES);
        this.num2=findViewById(R.id.num2RES);
        this.resultado=findViewById(R.id.resulRES);

        this.operar=findViewById(R.id.botSUM);
        this.operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num3 = Integer.parseInt(num1.getText().toString());
                int num4 = Integer.parseInt(num2.getText().toString());
                int resultado1 = num3 + num4;
                resultado.setText(String.valueOf(resultado1));
            }
        });
        this.botonVol=findViewById(R.id.but_volDIV);
        this.botonVol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent dos = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(dos);
            }
        });
    }
}