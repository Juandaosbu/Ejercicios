package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class actividad7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad7);
    }

    public void calcular(View v){
        EditText farenheit = findViewById(R.id.etfarenheit);
        EditText resul = findViewById(R.id.resultado);

        float frh = Float.valueOf(farenheit.getText().toString());
        double ct = (frh-32)*5/9;
        resul.setText(String.valueOf(ct));

    }
}