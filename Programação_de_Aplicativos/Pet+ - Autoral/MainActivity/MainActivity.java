package com.example.pet_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText login, senha;
    TextView titulo, text2, subtit, text3;
    CheckBox mostrarSenha;
    private Object String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        login = findViewById(R.id.login);
        senha = findViewById(R.id.senhalogin);
        titulo = findViewById(R.id.titulo);
        mostrarSenha = findViewById(R.id.mostrarSenha);

    }
    public void irTelaCadastroPet(View z){
        Intent go = new Intent(this, TelaCadastroPet.class);
        if(login.getText().length() == 0){
            login.setError("Você precisa inserir o seu E-mail para fazer login!");
        }
        else if(senha.getText().length() == 0){
            senha.setError("Você precisa inserir sua senha para fazer login!");
        }
        else if(login.getText().length() > 5){
            startActivity(go);
        }
        else if(senha.getText().length() > 8){
            startActivity(go);
        }
        else
        startActivity(go);
    }

    public void irTelaCadastro(View v) {
        Intent in = new Intent(this, TelaCadastro.class);
        startActivity(in);
    }

    public void mostrarSenha(View s) {
        if (mostrarSenha.isChecked()){
            senha.setInputType(InputType.TYPE_CLASS_TEXT);
        }else{
            senha.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }
}
