package com.example.revisao_exception;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alerta;
    EditText anoNasc;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alerta = new AlertDialog.Builder(this);
        anoNasc = findViewById(R.id.anoNasc);
        calcular = findViewById(R.id.calcular);
    }

    public void calculaIdade(View v){
        String mensagem = "Em 2022 você completa ";
        try{
            int anoDigitado = Integer.parseInt(anoNasc.getText().toString());
            int idade = 2022-anoDigitado;
            mensagem += idade+" anos.";
            if (anoDigitado < 1900){
                mensagem = "Você ta morto meu filho";
            } else if (anoDigitado >= 2022){
                mensagem = "Você nem nasceu ainda";
            }
        }catch (Exception e) {
            mensagem = "Você precisa inserir um valor válido";
        }
        alerta.setTitle("Resultado");
        alerta.setMessage(mensagem);
        alerta.show();
    }
}
