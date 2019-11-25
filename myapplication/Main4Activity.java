package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main4Activity extends AppCompatActivity {

    EditText Ed1,Ed2 ;
    String salon, edif,nombre,nom="";
    String temp1="",temp2="",Linea;
    RadioButton R1,R2,R3,R4,R5 ;

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    // BUSQUEDA DE SALONES
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        R1 = (RadioButton) findViewById(R.id.radioButton);
        R2 = (RadioButton) findViewById(R.id.radioButton2);
        R3 = (RadioButton) findViewById(R.id.radioButton3);
        R4 = (RadioButton) findViewById(R.id.radioButton4);
        R5 = (RadioButton) findViewById(R.id.radioButton5);

        }

        public void buscar(View view) {

            validar();


            Ed1 = (EditText) findViewById(R.id.editText);
            Ed2 = (EditText) findViewById(R.id.editText2);

          //  edif = Ed1.getText().toString();
            salon = Ed2.getText().toString();
            nombre = edif + salon;

            convertir(edif, salon);


            try{
            InputStreamReader archivo = new InputStreamReader(openFileInput("Archivo.txt"));
            BufferedReader br = new BufferedReader(archivo);

            Linea = br.readLine();
            System.out.println("Archivo: " + Linea + " Nombre: " + nombre + " Conversion: " + nom);


            if (Linea == null) {
                Toast.makeText(this, "No hay resultado de la busqueda", Toast.LENGTH_SHORT).show();
            } else {
                while (Linea != null) {

                    if (Objects.equals(Linea, nombre)) {
                        System.out.println("IF Linea: " + Linea);
                        Toast.makeText(this,"Busqueda Exitosa",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this, Main6Activity.class);
                        intent.putExtra(EXTRA_MESSAGE, nom);
                        startActivity(intent);
                    }

                    Linea = br.readLine();
                   // System.out.println("While Linea: " + Linea);
                }


                br.close();
                archivo.close();
                Toast.makeText(this,"Verifique Edificio o Numero",Toast.LENGTH_SHORT).show();
            }
        }
            catch(IOException e){

                    }
                }




        public void convertir(String st1, String st2){

        if(st1.equals("icco1"))
             temp1="aa";
            if(st1.equals("icco2"))
                temp1="bb";
            if(st1.equals("icco3"))
                temp1="cc";
            if(st1.equals("icco4"))
                temp1="dd";
            if(st1.equals("icco5"))
                temp1="ee";

        if(st2.equals("101")||st2.equals("001"))
            temp2="ff";
        if(st2.equals("102")||st2.equals("002"))
            temp2="gg";
        if(st2.equals("103")||st2.equals("003"))
            temp2="hh";
            if(st2.equals("104")||st2.equals("004"))
                temp2="ii";
            if(st2.equals("105")||st2.equals("201")||st2.equals("005")) //Falta otro salon
                temp2="jj";

            if(st2.equals("202"))
            temp2="kk";
            if(st2.equals("203"))
            temp2="ll";
            if(st2.equals("204"))
            temp2="mm";
            if(st2.equals("301"))
            temp2="nn";
            if(st2.equals("303"))
            temp2="ññ";
            if(st2.equals("304"))
            temp2="oo";
            if(st2.equals("310")||(st2.equals("305")))
            temp2="pp";
            if(st2.equals("307"))
            temp2="qq";
            if(st2.equals("308"))
            temp2="rr";
            if(st2.equals("309"))
            temp2="ss";
            if(st2.equals("401"))
            temp2="tt";
            if(st2.equals("402"))
            temp2="uu";
            if(st2.equals("403"))
            temp2="vv";
            if(st2.equals("404"))
            temp2="ww";

            if (st2.equals("109")||st2.equals("206"))
                temp2="xx";
                if(st2.equals("114")||st2.equals("207"))
                    temp2="yy";
            if (st2.equals("208"))
                temp2="zz";
        System.out.println("temps: "+temp1 + temp2 );

        nom=temp1+temp2;

    }

    public void validar(){

        // Check which radio button was clicked
   if(R1.isChecked())
       edif="icco1";
       if(R2.isChecked())
           edif="icco2";
           if(R3.isChecked())edif="icco3";
               if(R4.isChecked())edif="icco4";
                   if(R5.isChecked())edif="icco5";


            //        Toast.makeText(this, "Seleccione un edificio", Toast.LENGTH_SHORT).show();
        }

}
