package com.example.rafaela.bicjr;

import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    //Atributos tipo Button e EditText
    private Button btn;
    private EditText nome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa Elemento com variavel a partir do id
        btn = (Button) findViewById(R.id.botao);
        nome = (EditText) findViewById(R.id.nome);

        // Metodo para acao do clique no botão
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(nome.getText().toString() + ", seja Bem vindo(a)!!!");
                dlg.setNeutralButton("OK", null);
                dlg.show();

            }
        });

    }


}


