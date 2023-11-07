package com.example.aplicacionsanviator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipalProfesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal_profesor);
        Button botonAusencias=(Button) findViewById(R.id.BotonNotificarAusencias);
        botonAusencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaPrincipalProfesor.this,PantallaAusenciasDocente.class);
                startActivity(intent);
            }
        });
    }
}