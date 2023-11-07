package com.example.aplicacionsanviator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);
        EditText nombreUsuario=findViewById(R.id.editTextNombreUsuario);
        EditText contraseña=findViewById(R.id.editTextContraseña);



        Button BotonInicioSesion = (Button) findViewById(R.id.BotonInicioSesion);
        BotonInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String nombreUsuarioString=nombreUsuario.getText().toString();
               String contraseñaString=contraseña.getText().toString();
               TextView mensajeError=findViewById(R.id.mensajeError);

               if(nombreUsuarioString.equals("Miguel")&&contraseñaString.equals("1234")){
                   nombreUsuario.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                   contraseña.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                   mensajeError.setVisibility(View.VISIBLE);
                   mensajeError.setVisibility(View.GONE);
                   Snackbar.make(v, "Sesión iniciada con éxito", Snackbar.LENGTH_LONG).show();
                   Intent intent = new Intent(PantallaPrincipal.this,PantallaPrincipalProfesor.class);
                   startActivity(intent);

               }else if(nombreUsuarioString.equals("Pepe")&&contraseñaString.equals("hola")){
                   nombreUsuario.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                   contraseña.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                   mensajeError.setVisibility(View.VISIBLE);
                   mensajeError.setVisibility(View.GONE);
                   Snackbar.make(v, "Sesión iniciada con éxito", Snackbar.LENGTH_LONG).show();
                   Intent intent = new Intent(PantallaPrincipal.this, PantallaPrincipalJefeEstudios.class);
                   //startActivity(intent);
               }else if(nombreUsuarioString.equals("Maria")&&contraseñaString.equals("adios")){
                   nombreUsuario.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                   contraseña.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                   mensajeError.setVisibility(View.VISIBLE);
                   mensajeError.setVisibility(View.GONE);
                   Snackbar.make(v, "Sesión iniciada con éxito", Snackbar.LENGTH_LONG).show();
                   Intent intent = new Intent(PantallaPrincipal.this,PantallaPrincipalCoordinador.class);
                   //startActivity(intent);
               }else{
                   mensajeError.setVisibility(View.VISIBLE);
                   nombreUsuario.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                   contraseña.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
               }
               }

        });

}
}


