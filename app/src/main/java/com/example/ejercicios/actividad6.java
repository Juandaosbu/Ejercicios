package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividad6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad6);
    }

    public void calcular(View v){
        EditText edad = findViewById(R.id.etedad);
        EditText resul = findViewById(R.id.resultado);

        float ed = Float.valueOf(edad.getText().toString());
        double npul =  (220 - ed)/10;
        resul.setText(String.valueOf(npul));

    }
}