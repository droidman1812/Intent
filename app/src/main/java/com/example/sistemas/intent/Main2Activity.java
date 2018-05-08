package com.example.sistemas.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
        private TextView nombre1,apellido1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre1=findViewById(R.id.tv1);
        apellido1=findViewById(R.id.tv2);

        String dato1=getIntent().getStringExtra("dato1");
        String dato2=getIntent().getStringExtra("dato2");

        nombre1.setText(dato1);
        apellido1.setText(dato2);
    }

    public void Regresar (View view){
        Intent regresa = new Intent(this,MainActivity.class);
        startActivity(regresa);
    }



}
