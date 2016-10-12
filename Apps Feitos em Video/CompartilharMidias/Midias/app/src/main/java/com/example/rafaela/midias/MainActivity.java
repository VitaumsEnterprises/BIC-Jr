package com.example.rafaela.midias;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp = null;
    //Funcao para parar o audio
    private void pararAudio(){
        if (mp!=null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_audio1 = (Button) findViewById(R.id.btn_audio1);//Resgatando o botão da view
        btn_audio1.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {//Metodo de click longo

                //Cria a pasta "Audio" no diretorio de armazenamento do dispositivo
                File pasta = new File(Environment.getExternalStorageDirectory().toString()+"/Audio/");
                if(!pasta.exists()) {
                    pasta.mkdirs();
                }
                //copia para os audios para o diretorio

                String caminho = Environment.getExternalStorageDirectory().toString() +
                        "/Audio/";
                File dir = new File(caminho);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        copiarDispositivo(R.raw.audio_1, pasta + File.separator +
                                ("audio_1.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //intenção que o Android interpretará e solicitará ao usuário
                //que decida com qual aplicação ele a quer usar.

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");

               // inicializará o Intent, carregando para uma aplicação externa que aceita
               // arquivos .mp3 escolhida pelo usuário, o nosso arquivo audio_1.mp3 ou audio_2.mp3.

                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM,
                        Uri.parse(Environment.getExternalStorageDirectory().toString()
                                +"/Audio/"+("audio_1.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));
                boolean longclicked = true;
                return false;
            }
        });

        Button btn_audio2 = (Button) findViewById(R.id.btn_audio2);//Resgatando o botão da view
        btn_audio2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) { //Metodo de click longo
                File pasta = new File(Environment.getExternalStorageDirectory().toString()+"/Audio/");
                if(!pasta.exists()) {
                    pasta.mkdirs();
                }
                String caminho = Environment.getExternalStorageDirectory().toString() +
                        "/Audio/";
                File dir = new File(caminho);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        copiarDispositivo(R.raw.audio_2, pasta + File.separator +
                                ("audio_2.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM,
                        Uri.parse(Environment.getExternalStorageDirectory().toString()
                                +"/Audio/"+("audio_2.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));
                boolean longclicked = true;
                return false;
            }
        });
    }

    //Método para copiar os audios para o dispositivo
    private void copiarDispositivo(int id, String caminho) throws IOException {
        InputStream in = getResources().openRawResource(id);
        FileOutputStream out = new FileOutputStream(caminho);
        byte[] buff = new byte[1024];
        int read;
        try {
            while ((read = in.read(buff)) > 0) {
                out.write(buff, 0, read);
            }
        } finally {
            in.close();
            out.close();
        }
    }
//Metodos do click dos dois botoes que chamam a musica
    public void audio1 (View v){
        pararAudio();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.audio_1);
        mp.start();
    }

    public void audio2 (View v){
        pararAudio();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.audio_2);
        mp.start();

    }

}
