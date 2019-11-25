package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("Archivo.txt", Activity.MODE_PRIVATE));
            archivo.write("icco1001\nicco1002\nicco1003\nicco1004\nicco1005\nicco2206\nicco2207\nicco2208\n" +
                    "icco3101\nicco3104\nicco3109\nicco3114\nicco3201\nicco3301\nicco3303\nicco3309\nicco3310\n" +
     "icco4101\nicco4102\nicco4103\nicco4104\nicco4201\nicco4202\nicco4203\nicco4204\nicco4301\nicco4303\nicco4304\nicco4305\nicco4307\n" +
      "icco4308\nicco4309\nicco4401\nicco4402\nicco4403\nicco4404\n" +
                    "icco5103\nicco5201\nicco5202\nicco5203\n" +
                    "Ambrosio Vazquez Alma Delia\nContreras Gonzalez Meliza\nAnzures Garcia Mario\nAriza Velazquez Eduardo\n" +
                    "Bello Lopez Pedro\nBeltran Martinez Beatriz\nBermudez Juarez Maria Blanca del Carmen\nCastro Cardona Mauricio\n" +
                    "Ceron Garnica Carmen\nCervantes Marquez Ana Patricia\nColmenares Guillen Luis Enrique\nDe la Rosa Flores Rafael\n" +
                    "Estrada Analco Jose Martin\nGonzales Velazquez Rogelio\nHerrera Cobian Diego Guadalupe\nJimenez Gonzales Jorge Gustavo\n" +
                    "Lavalle Martinez Jose de Jesus\nLeon Chavez Miguel Angel\nLopez Perez Oliva\nMartinez Camarillo Carlos Adrian\n" +
                    "Mertinez Guzman Gerardo\nOrato Ramirez Jose Martin\nGonzales Tzontecomani Jose Ismael\n");
            archivo.flush();
            archivo.close();
        }
        catch(IOException e){

        }

        Toast.makeText(this,"Archivo creado",Toast.LENGTH_SHORT).show();
    }

    public void Mostrar(View view){

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

    public void Busqueda(View view){

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }
}
