package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
    }

    public void calcular(View v){
        EditText obr1 = findViewById(R.id.obr1);
        EditText obr2 = findViewById(R.id.obr2);
        EditText obr3 = findViewById(R.id.obr3);
        EditText obr4 = findViewById(R.id.obr4);
        EditText obr5 = findViewById(R.id.obr5);
        EditText total = findViewById(R.id.Valtotal);

        float dobr1 = Float.valueOf(obr1.getText().toString());
        float dobr2 = Float.valueOf(obr2.getText().toString());
        float dobr3 = Float.valueOf(obr3.getText().toString());
        float dobr4 = Float.valueOf(obr4.getText().toString());
        float dobr5 = Float.valueOf(obr5.getText().toString());

        double nobr1 = dobr1*1000;
        double nobr2 = dobr2*1000;
        double nobr3 = dobr3*1000;
        double nobr4 = dobr4*1000;
        double nobr5 = dobr5*1000;

        obr1.setText(String.valueOf(nobr1));
        obr2.setText(String.valueOf(nobr2));
        obr3.setText(String.valueOf(nobr3));
        obr4.setText(String.valueOf(nobr4));
        obr5.setText(String.valueOf(nobr5));
        total.setText(String.valueOf(nobr1 + nobr2 + nobr3 + nobr4 + nobr5));
    }
}