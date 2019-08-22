package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
int Numero_1 = R.id.numero_1;
int Numero_2 = R.id.numero_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button Sumar = (Button) findViewById(R.id.sumar);
        Sumar.setOnClickListener(this);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onClick(View view) {
        TextView Resultado = (TextView) findViewById(R.id.resultado);
        Resultado.setText(Numero_1+Numero_2);
    }
}
