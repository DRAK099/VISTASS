package com.example.navigation;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button hola;
    private RadioGroup GrupoOpciones;

    private RadioButton sum;
    private RadioButton res;
    private RadioButton multi;
    private RadioButton div;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hola = findViewById(R.id.button);
        GrupoOpciones=findViewById(R.id.opciones);
        hola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                validar();
            }
        });
    }
    void CambiarSum(){
        Intent sum = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(sum);
    }
    void CambiarRes(){
        Intent res = new Intent(MainActivity.this,Restar.class);
        startActivity(res);
    }
    void CambiarMult(){
        Intent mul = new Intent(MainActivity.this,Multiplicacion.class);
        startActivity(mul);
    }
    void CambiarDiv(){
        Intent div = new Intent(MainActivity.this,Dividir.class);
        startActivity(div);
    }
    public void validar(){

        if (GrupoOpciones.getCheckedRadioButtonId()==R.id.bot_Sum){
            CambiarSum();
        } else if (GrupoOpciones.getCheckedRadioButtonId()==R.id.bot_Res) {
            CambiarRes();
        } else if (GrupoOpciones.getCheckedRadioButtonId()==R.id.bot_Mult) {
            CambiarMult();
        }else if(GrupoOpciones.getCheckedRadioButtonId()==R.id.bot_Div){
            CambiarDiv();
        }
    }
}