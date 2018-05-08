package com.example.sistemas.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        private EditText nombre,apellido,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.txtnombre);
        apellido=(EditText)findViewById(R.id.txtapellido);
        url=(EditText)findViewById(R.id.txturl);

        String nombres=nombre.getText().toString();
        String apellidos=apellido.getText().toString();
    }

        public void Enviar (View view){
            Intent intento = new Intent(this,Main2Activity.class);
            intento.putExtra("dato1",nombre.getText().toString());
            intento.putExtra("dato2",apellido.getText().toString());
            startActivity(intento);
        }

        public void Navegar (View view){
            Intent navega = new Intent(this,Main3Activity.class);
            navega.putExtra("url",url.getText().toString());
            startActivity(navega);
        }
    public void Cerrar(View view){
            finish();
    }
}
