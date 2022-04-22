package com.example.pet_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {
    EditText nomecompleto, email, senhacadastro;
    CheckBox receberNewsLetter, mostrarSenha2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        getSupportActionBar().hide();
        nomecompleto = findViewById(R.id.nomeCompleto);
        email = findViewById(R.id.email);
        senhacadastro = findViewById(R.id.senhacadastro);
        receberNewsLetter = findViewById(R.id.receberNewsLetter);
        mostrarSenha2 = findViewById(R.id.mostrarSenha2);
    }

    public void telaCadastroFeito (View f) {
        Intent vai = new Intent(TelaCadastro.this, ContaCriada.class);
        if (nomecompleto.getText().length() == 0) {
            nomecompleto.setError("Você precisa inserir o seu nome para se cadastrar!");
        }
        else if (email.getText().length() < 5) {
            email.setError("Você precisa inserir um email válido!");
        }
        else if (senhacadastro.getText().length() < 8) {
            senhacadastro.setError("A sua senha deve ter pelo menos 8 caracteres!");
        }
        else startActivity(vai);
    }

    public void receberNewsLetter (View view){
        if (receberNewsLetter.isChecked()){
            Toast.makeText(this, "A partir de agora você irá receber nossas NewsLetter!", Toast.LENGTH_LONG).show();
        }
    }

    public void mostrarSenha (View m){
        if (mostrarSenha2.isChecked()){
            senhacadastro.setInputType(InputType.TYPE_CLASS_TEXT);
        }else{
            senhacadastro.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }
}
