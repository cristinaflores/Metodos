package com.example.miell_000.metodos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre;
    TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = (EditText) findViewById(R.id.edtNombre);
        tvSaludo = (TextView) findViewById(R.id.tvSaludo);
    }



    public void mostrarMensaje(View v){
        Toast.makeText(this,"Hola Mundo", Toast.LENGTH_SHORT).show();

    }

    public void otroMensaje(View v){
        String nombre = edtNombre.getText().toString();
        tvSaludo.setText("Hola "+nombre);
    }

    public void mostrarActividad(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

}
