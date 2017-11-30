package com.example.adoniran.guiam;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import model.Atividade;

public class Cadastro_atividade extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_atividade);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEvento();
            }
        });
    }
    public void addEvento(){
        mAuth = FirebaseAuth.getInstance();
        Atividade tempUser = GetAtvView();
        DatabaseReference drUsers = FirebaseDatabase.
                getInstance().getReference("atividade");
        drUsers.child(mAuth.getCurrentUser().getUid()).
                setValue(tempUser);
        String msg="atividade cadastrada";
        Toast.makeText(Cadastro_atividade.this, msg,Toast.LENGTH_SHORT).show();
    }
    public Atividade GetAtvView(){

        String nome,descricao,dataI,data_final, rua, bairro,estado, cidade, pais;
        EditText ed1= (EditText) findViewById(R.id.editAtv_nome);
                nome = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_bairro);
                bairro = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_rua);
                rua = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_desc);
                descricao = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_cidade);
                cidade = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_estado);
                estado = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_pais);
                pais = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_inicio);
                dataI = ed1.getText().toString();
        ed1= (EditText) findViewById(R.id.editAtv_final);
                data_final = ed1.getText().toString();
       Atividade at=new Atividade(
                nome,descricao,dataI,data_final, rua, bairro,estado, cidade, pais
       );
        return at;
    }

}
