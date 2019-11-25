package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class Main6Activity extends AppCompatActivity {

    ImageView imagen, imagen2, imagen3,imagen4;
    String img,opc;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        imagen = (ImageView) findViewById(R.id.imageView);
        imagen2 = (ImageView) findViewById(R.id.imageView2);
        imagen3 = (ImageView) findViewById(R.id.imageView3);
        imagen4 = (ImageView) findViewById(R.id.imageView4);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Main4Activity.EXTRA_MESSAGE);

        String img = message;
        opc=img.toString();

        System.out.println("OPC: "+ opc);

        switch (opc){

            case "aaff":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.aaff);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco1 001
                break;
            case "aagg":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.aagg);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco1 002
                break;
            case "aahh":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.aahh);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco1 003
                break;
            case "aajj":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.aajj);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco1 005
                break;
            case "bbxx":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.bbxx);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco1 005
                break;
            case "bbyy":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.bbyy);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco1 005
                break;
            case "bbzz":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.bbzz);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco1 005
                break;

            case "ccff":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccff);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 101
                break;

            case "ccgg":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccgg);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 104
                break;

            case "ccxx":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccxx);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 109
                break;

            case "ccyy":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccyy);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 114
                break;

            case "cczz":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.cczz);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 208
                break;

            case "ccnn":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccnn);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 301
                break;

            case "ccgn":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccgn);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 303
                break;

            case "ccss":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccss);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 309
                break;

            case "ccpp":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ccpp);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            }); //icco3 310
                break;

            case "ddff":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddff);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break;//icoo4 101

            case "ddgg":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddgg);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break;//icoo4 102
            case "ddhh":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddhh);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 103
            case "ddii":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddii);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 104

            case "ddjj":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                        View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                        PhotoView photoView = mView.findViewById(R.id.imageView);
                        photoView.setImageResource(R.drawable.ddjj);
                        mBuilder.setView(mView);
                        AlertDialog mDialog = mBuilder.create();
                        mDialog.show();
                    }
                });break; //icoo4 201

            case "ddkk":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddkk);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 202

            case "ddll":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddll);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 203

            case "ddmm":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddmm);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 204

            case "ddnn":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddnn);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 301

            case "ddññ":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddgn);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 303

            case "ddoo":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddoo);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 304
            case "ddpp":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddpp);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 305
            case "ddqq":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddqq);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 307

            case "ddrr":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddrr);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 308
            case "dddd":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddss);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 309
            case "ddtt":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddtt);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 401
            case "dduu":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.dduu);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 402
            case "ddvv":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddvv);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 403

            case "ddww":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ddww);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo4 404

            case "eejj":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.eejj);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo5 201

            case "eekk":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.eekk);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo5 202

            case "eell":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.eell);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //icoo5 203


            //Aqui va la parte de los cubos


            case "aa":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.aa);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ab":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ab);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ac":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ac);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ad":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ad);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ae":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ae);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "af":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.af);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ag":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ag);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ah":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ah);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ai":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ai);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "aj":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.aj);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ak":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ak);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "am":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.am);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "an":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.an);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "agn":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.agn);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ao":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ao);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ap":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ap);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "aq":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.aq);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "ar":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.ar);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "as":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.as);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "at":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.at);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "au":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.au);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

            case "av":  imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main6Activity.this);
                    View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                    PhotoView photoView = mView.findViewById(R.id.imageView);
                    photoView.setImageResource(R.drawable.av);
                    mBuilder.setView(mView);
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
            });break; //CUBOS DE ICCO1

        }



    }


}
