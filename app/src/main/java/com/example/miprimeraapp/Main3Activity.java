package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Main3Activity extends AppCompatActivity {
    Button btn;
    LinearLayout line;
    int contar = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn = findViewById(R.id.btn_contador);
        line = findViewById(R.id.lycontador);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView a = new TextView(getApplicationContext());
                a.setText("Hola"+contar);
                contar++;
                if(contar == 10){
                    line.addView(a);
                    Toast.makeText(Main3Activity.this,"Holas",Toast.LENGTH_LONG);
                }

            }
        });
    }
}
