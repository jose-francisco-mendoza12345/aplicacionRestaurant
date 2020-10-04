package com.example.proyectooriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RestauranteActivity extends AppCompatActivity {
    private EditText nombre, nit, propietario, calle, telf, lon, lat, fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        nombre=(EditText) findViewById(R.id.TextoNombre);
        nit=(EditText) findViewById(R.id.TextoNit);
        propietario=(EditText) findViewById(R.id.TextoPropiet);
        calle=(EditText) findViewById(R.id.TextoCalle);
        telf=(EditText) findViewById(R.id.TextoTelf);
        lon=(EditText) findViewById(R.id.TextoLog);
        lat=(EditText) findViewById(R.id.TextoLat);
        fecha=(EditText) findViewById(R.id.TextFecha);
    }

    public  void Guargar(View view)
    {
        Intent otraActividad2=new Intent(this,CrearMenu.class);
        if(!nombre.getText().toString().isEmpty() && !nit.getText().toString().isEmpty() &&
            !propietario.getText().toString().isEmpty() && !calle.getText().toString().isEmpty() &&
            !telf.getText().toString().isEmpty() && !lon.getText().toString().isEmpty() &&
                !lat.getText().toString().isEmpty() && !fecha.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Los Datos han sido registrados", Toast.LENGTH_SHORT).show();
            startActivity(otraActividad2);
        }
        else
        {
            Toast.makeText(this, "Debe de Llenar todos los Cuadros", Toast.LENGTH_SHORT).show();
        }
    }
}