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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import model.Usuario;

public class Login extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void buttonSignInClick(View view) {
        Email=(EditText) findViewById(R.id.edit_email_log);
        Password=(EditText)findViewById(R.id.edit_password_log);

        String login = Email.getText().toString();

        String passwd = Password.getText().toString();

        mAuth = FirebaseAuth.getInstance();

        mAuth.signInWithEmailAndPassword(login, passwd).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

            @Override

            public void onComplete(@NonNull Task<AuthResult> task) {

                String msg = task.isSuccessful() ? "SIGN IN OK!":"SIGN IN ERROR!";
                Toast.makeText(Login.this, msg, Toast.LENGTH_SHORT).show();


//                Intent it =new Intent(this,User.class);
//                startActivity(it);
            }

        });


    }
}
