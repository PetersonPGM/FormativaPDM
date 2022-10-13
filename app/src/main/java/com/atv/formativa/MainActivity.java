package com.atv.formativa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoRandom(View view) {
        this.opcaoSelecionada("Cassaco");
        this.opcaoSelecionada("Vombate");
        this.opcaoSelecionada("PS5");
        this.opcaoSelecionada("XSX");
        this.opcaoSelecionada("SW");}

    public void opcaoSelecionada(String opcaoSelecionada){
        ImageView ImageResultado = findViewById(R.id.ImageResultado);

        int numero = new Random().nextInt(5);
        String[] opcoes = {"Cassaco", "Vombate", "PS5", "XSX", "SW"};
        String opcaoApp = opcoes[numero];

        switch(opcaoApp){
            case "Cassaco":
                ImageResultado.setImageResource(R.drawable.cas);
                break;

            case "Vombate":
                ImageResultado.setImageResource(R.drawable.wom);
                break;

            case "PS5":
                ImageResultado.setImageResource(R.drawable.ps5);
                break;

            case "XSX":
                ImageResultado.setImageResource(R.drawable.xsx);
                break;

            case "SW":
                ImageResultado.setImageResource(R.drawable.sw);
                break;
        }
    }

    public void alterarTexto(View view){
        TextView texto = findViewById(R.id.textoEndereco);
        texto.setText("Cadastro efetuado com sucesso!");
    }
}