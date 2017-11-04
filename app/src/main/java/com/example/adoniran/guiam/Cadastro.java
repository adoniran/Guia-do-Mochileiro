package com.example.adoniran.guiam;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.*;

public class Cadastro extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

    }
    public void buttonSignUpClick(View view) {
        Email=(EditText) findViewById(R.id.edit_email);
        Password=(EditText)findViewById(R.id.edit_password);

        String email = Email.getText().toString();
        String password = Password.getText().toString();

        mAuth = FirebaseAuth.getInstance();

        mAuth.createUserWithEmailAndPassword(email, password)

                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    @Override

                    public void onComplete(@NonNull Task<AuthResult> task) {

                        String msg = task.isSuccessful() ? "SIGN UP OK!":"SIGN UP ERROR!";

                        Toast.makeText(Cadastro.this, msg,Toast.LENGTH_SHORT).show();

                    }

                });}
}
