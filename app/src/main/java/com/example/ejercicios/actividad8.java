package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividad8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad8);
    }

    public void calcular(View v){
        EditText centigrados = findViewById(R.id.etcentigrados);
        EditText resul = findViewById(R.id.resultado);

        float ctg = Float.valueOf(centigrados.getText().toString());
        double frh = ctg*1.8+32;
        resul.setText(String.valueOf(frh));

    }
}