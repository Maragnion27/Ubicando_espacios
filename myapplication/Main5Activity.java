package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main5Activity extends AppCompatActivity {

    //BUSQUEDA DE CUBICULOS
    EditText Ed1 ;
    String salon, prof,nombre,nom="";
    String temp1="",temp2="",Linea;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void buscar(View view) {

        Ed1 = (EditText) findViewById(R.id.editText);
        prof = Ed1.getText().toString();

        convertir(prof);


        try{
            InputStreamReader archivo = new InputStreamReader(openFileInput("Archivo.txt"));
            BufferedReader br = new BufferedReader(archivo);

            Linea = br.readLine();
            System.out.println("Archivo: " + Linea + " Nombre: " + prof + " Conversion: " + temp1);


            if (Linea == null) {
                Toast.makeText(this, "No hay resultado de la busqueda", Toast.LENGTH_SHORT).show();
            } else {
                while (Linea != null) {

                    if (Linea.equals(prof)) {
                        System.out.println("IF Linea: " + Linea);
                        Toast.makeText(this,"Busqueda Exitosa",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this, Main6Activity.class);
                        intent.putExtra(EXTRA_MESSAGE, temp1);
                        startActivity(intent);
                    }

                    Linea = br.readLine();
                    // System.out.println("While Linea: " + Linea);
                }


                br.close();
                archivo.close();
                Toast.makeText(this,"Error de busqueda",Toast.LENGTH_SHORT).show();
            }
        }
        catch(IOException e){

        }
    }

    public void convertir(String st1) {

        if(st1.equals("Ambrosio Vazquez Alma Delia"))
            temp1="as";
        if(st1.equals("Contreras Gonzales Meliza"))
            temp1="agn";
        if(st1.equals("Anzures Garcia Mario"))
            temp1="aa";
        if(st1.equals("Ariza Velazquez Eduardo"))
            temp1="ap";
        if(st1.equals("Bello Lopez Pedro"))
            temp1="af";
        if(st1.equals("Beltran Martinez Beatriz"))
            temp1="av";
        if(st1.equals("Bermudez Juarez Maria Blanca del Carmen"))
            temp1="ac";
        if(st1.equals("Castro Cardona Mauricio"))
            temp1="ab";
        if(st1.equals("Ceron Garnica Carmen"))
            temp1="an";
        if(st1.equals("Cervantes Marquez Ana Patricia"))
            temp1="at";
        if(st1.equals("Colmenares Guillen Luis Enrique"))
            temp1="ac";
        if(st1.equals("De la Rosa Flores Rafael"))
            temp1="au";
        if(st1.equals("Estrada Analco Jose Martin"))
            temp1="ad";
        if(st1.equals("Gonzales Tzontecomani Jose Ismael"))
            temp1="ae";
        if(st1.equals("Gonzales Velazquez Rogelio"))
            temp1="ak";
        if(st1.equals("Herrera Cobian Diego Guadalupe"))
            temp1="ar";
        if(st1.equals("Jimenez Gonzales Jorge Gustavo"))
            temp1="ai";
        if(st1.equals("Lavalle Martinez Jose de Jesus"))
            temp1="at";
        if(st1.equals("Leon Chavez Miguel Angel"))
            temp1="ab";
        if(st1.equals("Lopez Perez Oliva"))
            temp1="av";
        if(st1.equals("Martinez Camarillo Carlos Adrian"))
            temp1="ah";
        if(st1.equals("Mertinez Guzman Gerardo"))
            temp1="ao";
        if(st1.equals("Orato Ramirez Jose Martin"))
            temp1="aj";



    }


    }

