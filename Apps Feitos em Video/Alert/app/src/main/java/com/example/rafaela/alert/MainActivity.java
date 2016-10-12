package com.example.rafaela.alert;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensagem(View v){
        EditText texto = (EditText)findViewById(R.id.nome);
        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        dlg.setMessage(texto.getText().toString() + ", Bem vindo(a)!");
        dlg.setNeutralButton("OK", null);
        dlg.show();
    }
}
