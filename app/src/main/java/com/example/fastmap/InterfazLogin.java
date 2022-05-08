package com.example.fastmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InterfazLogin extends AppCompatActivity {
    EditText et_username, et_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_login);
    }

    void Login(){
        et_username = (EditText)findViewById(R.id.et_usuario);
        et_password = (EditText)findViewById(R.id.et_contraseña);
        btn_login = (Button)findViewById(R.id.btn_entrar);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_username.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")){
                    Toast.makeText(InterfazLogin.this, "Usuario y contraseña correcta", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(InterfazLogin.this,Usuario.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(InterfazLogin.this, "Usuario y contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}