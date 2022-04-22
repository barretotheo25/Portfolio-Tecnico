package com.example.pet_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class CadastroCachorro extends AppCompatActivity {
    RadioButton pequeno, medio, grande, feminino, masculino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cachorro);
        getSupportActionBar().hide();
        pequeno = findViewById(R.id.pequeno);
        medio = findViewById(R.id.medio);
        grande = findViewById(R.id.grande);
        feminino = findViewById(R.id.feminino);
        masculino = findViewById(R.id.masculino);
    }

}
