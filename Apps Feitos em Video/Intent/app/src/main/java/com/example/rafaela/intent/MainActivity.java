package com.example.rafaela.intent;

import android.content.Intent;
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

    public void trocartela1(View v){
        EditText texto = (EditText)findViewById(R.id.editText);

        Intent trocar = new Intent(MainActivity.this,SegundaActivity.class);
        trocar.putExtra("parametro", texto.getText().toString());
        startActivity(trocar);
    }
}
