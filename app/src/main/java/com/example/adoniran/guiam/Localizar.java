package com.example.adoniran.guiam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import model.Atividade;
import model.LocalizaHTTP;


public class Localizar extends AppCompatActivity {
    RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizar);
        this.queue = Volley.newRequestQueue(this);


        chamarInforCep();
    }


    public void chamarInforCep() {
        final EditText cep = (EditText) findViewById(R.id.edit_cep);
        final TextView resposta = (TextView) findViewById(R.id.etMain_resposta);
        Button btnBuscarCep =(Button) findViewById(R.id.buscar);
        btnBuscarCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                Atividade retorno=new LocalizaHTTP(cep.getText().toString()).execute().get();
                resposta.setText(retorno.toString());
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
