package com.example.proyectooriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText correo, password;
    private RadioButton registroNormal, registarRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText) findViewById(R.id.id_correo);
        password = (EditText) findViewById(R.id.id_password);

        registroNormal=(RadioButton) findViewById(R.id.rb_normal);
        registarRestaurante=(RadioButton) findViewById(R.id.rb_registroRes);
    }

    public void Sesion(View view) {
        String Correo = correo.getText().toString();
        String Password = password.getText().toString();


        if (Correo.length() == 0) {
                Toast.makeText(this, "El Correo es necesario", Toast.LENGTH_SHORT).show();
        }
        if (Password.length() == 0) {
                Toast.makeText(this, "La Contraseña es necesaria", Toast.LENGTH_SHORT).show();
        }
        if (Correo.length() != 0 && Password.length() != 0) {

            Toast.makeText(this, "La Sesion se ha Iniciado", Toast.LENGTH_SHORT).show();
        }
    }

    public void Registrar(View view)
    {
        String Correo=correo.getText().toString();
        String Password=password.getText().toString();
        Intent otraActividad=new Intent(this,RestauranteActivity.class);

        if(Correo.length()==0)
        {
            Toast.makeText(this, "El Correo es necesario", Toast.LENGTH_SHORT).show();
        }
        if(Password.length()==0)
        {
            Toast.makeText(this, "La Contraseña es necesaria", Toast.LENGTH_SHORT).show();
        }
        if(Correo.length()!=0 && Password.length()!=0)
        {
            if(registroNormal.isChecked()==false && registarRestaurante.isChecked()==false)
            {
                Toast.makeText(this, "Seleccione una opcion para continuar", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if(registroNormal.isChecked()==true)
                {
                    Toast.makeText(this, "El usuario ha sido Registrado", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Registre los datos de su Restaurante", Toast.LENGTH_SHORT).show();
                    startActivity(otraActividad);
                }
            }


        }

    }
}