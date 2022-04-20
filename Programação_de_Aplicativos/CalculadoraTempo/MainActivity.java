package com.example.calculadoratempo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText hora, min, hora2, min2;
    TextView result, result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        hora = findViewById(R.id.hora);
        min = findViewById(R.id.min);
        hora2 = findViewById(R.id.hora2);
        min2 = findViewById(R.id.min2);
        result = findViewById(R.id.result);
        result2 = findViewById(R.id.result2);
    }

    public void clicaSoma(View v){
        int a = Integer.parseInt(hora.getText().toString());
        int b = Integer.parseInt(min.getText().toString());
        int c = Integer.parseInt(hora2.getText().toString());
        int d = Integer.parseInt(min2.getText().toString());
        int somaMin = b+d;
        int somaHora = a+c;
//        int r1 =somaHora; // este é o resultado horas
//        int r2=somaMin; // este é o resultado dos minutos

        while(somaMin >59){
           somaHora = somaHora + 1;
           somaMin = somaMin - 60;
        }
        result.setText(somaHora+"");
        result2.setText(somaMin+"");
    }

    public void clicaSub(View view){
        int h1 = Integer.parseInt(hora.getText().toString());
        int m1 = Integer.parseInt(min.getText().toString());
        int c = Integer.parseInt(hora2.getText().toString());
        int d = Integer.parseInt(min2.getText().toString());
        int subMin;
        int subHora;
        //int r1; // este é o resultado horas
        //int r2; // este é o resultado dos minutos

        while( m1>59){
            h1 ++;
            m1 = m1 - 60;
        }
        while(d>59){
            c ++;
            d=d - 60;
        }

        if (c >h1){
            subHora = c - h1;
            subMin = d - m1;
        }
        else{
            subHora= h1-c;
            if(d>m1){
                subMin= d-m1;
            }
            else{
                subMin= m1-d;
            }
        }
        while(subMin<0){
            subHora --;
            subMin= subMin + 60;
        }
        result.setText(subHora+"");
        result2.setText(subMin+"");
    }
    public void clicareset(View z){
        hora.setText(" ");
        hora2.setText(" ");
        min.setText(" ");
        min2.setText(" ");
        result.setText("Resultado");
        result2.setText("Resultado");
    }
}
