package com.example.rafaela.calculadora;

import android.renderscript.Double2;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText n1, n2;
    private Button btsoma, btsub, btdiv, btmult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);

        btsoma = (Button) findViewById(R.id.soma);
        btsub = (Button) findViewById(R.id.sub);
        btmult = (Button) findViewById(R.id.mult);
        btdiv = (Button) findViewById(R.id.div);

        //Método para somar
        btsoma.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double soma = num1+num2; //Linha que soma os números

                AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
                resposta.setTitle("Resultado da Soma: ");
                resposta.setMessage("A resposta é: " + soma);
                resposta.setNeutralButton("OK", null);
                resposta.show();

            }
        });

        //Método para subtrair
        btsub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double sub = num1-num2; //Linha que subtrai os numeros

                AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
                resposta.setTitle("Resultado da Subtracao: ");
                resposta.setMessage("A resposta é: " + sub);
                resposta.setNeutralButton("OK", null);
                resposta.show();

            }
        });
        //Metodo para multiplicar
        btmult.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double mult = num1*num2; //Linha que multiplica os numeros

                AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
                resposta.setTitle("Resultado da Multiplicacao: ");
                resposta.setMessage("A resposta é: " + mult);
                resposta.setNeutralButton("OK", null);
                resposta.show();

            }
        });

        //Metodo para dividir
        btdiv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double div= num1/num2;//linha que divide os numeros

                AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
                resposta.setTitle("Resultado da Divisao: ");
                resposta.setMessage("A resposta é: " + div);
                resposta.setNeutralButton("OK", null);
                resposta.show();

            }
        });
    }
}
