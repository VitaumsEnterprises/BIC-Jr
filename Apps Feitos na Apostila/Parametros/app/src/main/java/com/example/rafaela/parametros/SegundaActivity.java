package com.example.rafaela.parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent ok = getIntent();
        TextView txt = (TextView) findViewById(R.id.txtTela2);
        String nome = (String) ok.getSerializableExtra("parametro");
        txt.setText("Olá," + nome);
    }
}
