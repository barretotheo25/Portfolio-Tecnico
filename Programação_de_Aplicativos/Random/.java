package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText d, l;
    TextView r;
    int NumDados, numLados;
    ImageView imgDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        d = findViewById(R.id.dados);
        l = findViewById(R.id.lados);
        r = findViewById(R.id.resultado);
        imgDado = findViewById(R.id.img);
    }
    public void play(View dadedidodu){
        try {
            NumDados = Integer.parseInt(d.getText().toString());
            numLados = Integer.parseInt(l.getText().toString());
        }catch (Exception e){
            NumDados = 0;
            numLados = 0;
            Toast.makeText(this, "Digite todas as informações", Toast.LENGTH_SHORT).show();
        }
        Random mauricio = new Random();
        /*
        String s = "Resultado:\n";
        int q = 0;
        while(q < NumDados){
            q++;
            s += "Dado "+q+": "+(mauricio.nextInt(numLados)+1)+"\n";
        }
        r.setText(s);
        */
        int gerado = mauricio.nextInt(numLados)+1;
        ViewGroup.LayoutParams tamanho = imgDado.getLayoutParams();
        tamanho.height = 300;
        tamanho.width = 300;
        imgDado.setLayoutParams(tamanho);
        if(numLados == 4){
            if (gerado == 1){
                imgDado.setImageResource(R.drawable.numero1quatrolados);
            }
            else if (gerado == 2){
                imgDado.setImageResource(R.drawable.numero2quatrolados);
            }
            else if (gerado == 3){
                imgDado.setImageResource(R.drawable.numero3quatrolados);
            }
            else {
                imgDado.setImageResource(R.drawable.numero4quatrolados);
            }
        }
        if (numLados == 6){
            if (gerado == 1){
                imgDado.setImageResource(R.drawable.numero1);
            }
            else if (gerado == 2){
                imgDado.setImageResource(R.drawable.numero2);
            }
            else if (gerado == 3){
                imgDado.setImageResource(R.drawable.numero3);
            }
            else if (gerado == 4){
                imgDado.setImageResource(R.drawable.numero4);
            }
            else if (gerado == 5){
                imgDado.setImageResource(R.drawable.numero5);
            }
            else {
                imgDado.setImageResource(R.drawable.numero6);
            }
        }
    }
}
