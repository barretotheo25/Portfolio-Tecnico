package com.example.pet_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContaCriada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta_criada);
        getSupportActionBar().hide();
    }

    public void irCadastroPet(View p){
        Intent ir = new Intent(this, TelaCadastroPet.class);
        startActivity(ir);
    }
    public void sairDoApp(View a){
        finishAffinity();
    }
}
