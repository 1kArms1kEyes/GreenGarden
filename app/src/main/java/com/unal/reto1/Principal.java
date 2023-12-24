package com.unal.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button botonCategorias = findViewById(R.id.btnCategorias);
        botonCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sig = new Intent(Principal.this, Categorias.class);
                startActivity(sig);
            }
        });

        Button botonEstadisticas = findViewById(R.id.btnEstadisticas);
        botonEstadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sig = new Intent(Principal.this, Estadisticas.class);
                startActivity(sig);
            }
        });

        Button botonConsejos = findViewById(R.id.btnConsejos);
        botonConsejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sig = new Intent(Principal.this, Consejos.class);
                startActivity(sig);
            }
        });
    }
}