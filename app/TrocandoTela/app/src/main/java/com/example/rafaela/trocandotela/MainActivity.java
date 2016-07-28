package com.example.rafaela.trocandotela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = (Button) findViewById(R.id.btnTroca);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocaActivity = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(trocaActivity);
            }
        });
    }
}
