package com.example.a2dam.alertdialogsprova;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder adBuilder1 = new AlertDialog.Builder(this);
        adBuilder1.setMessage(R.string.mensaje);
        adBuilder1.setTitle(R.string.titulo);
        adBuilder1.setPositiveButton(R.string.botonAceptar, this);
        adBuilder1.setNegativeButton(R.string.botonCancelar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mostraDialeg2();
            }
        });
        AlertDialog alertDialog = adBuilder1.create();
        alertDialog.show();
    }



public void mostraDialeg2() {
    AlertDialog.Builder adBuilder2 = new AlertDialog.Builder(this);
   // adBuilder2.setMessage(R.string.mensaje);
    adBuilder2.setTitle(R.string.titulo);
    adBuilder2.setPositiveButton(R.string.botonAceptar, this);
    adBuilder2.setNegativeButton(R.string.botonCancelar, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    });
    adBuilder2.setItems(R.array.opciones, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    });
    AlertDialog alertDialog1 = adBuilder2.create();
    alertDialog1.show();

}

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }
}