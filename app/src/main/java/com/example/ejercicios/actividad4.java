package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividad4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);
    }

    public void calcular(View v){
        EditText edt = findViewById(R.id.etdecadas);
        EditText resul = findViewById(R.id.resultado);

        float deca = Float.valueOf(edt.getText().toString());
        double dias = deca * 3652.42;
        resul.setText(String.valueOf(dias));

    }
}