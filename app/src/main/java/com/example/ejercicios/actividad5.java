package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividad5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad5);
    }

    public void calcular(View v){
        EditText pre = findViewById(R.id.presion);
        EditText vol = findViewById(R.id.volumen);
        EditText tem = findViewById(R.id.temperatura);
        EditText total = findViewById(R.id.Valtotal);

        float pr = Float.valueOf(pre.getText().toString());
        float vl = Float.valueOf(vol.getText().toString());
        float tp = Float.valueOf(tem.getText().toString());

        double masa = (pr * vl)/(0.37 * (tp + 460));

        total.setText(String.valueOf(masa));
    }
}