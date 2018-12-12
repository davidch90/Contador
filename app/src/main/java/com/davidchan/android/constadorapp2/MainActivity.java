package com.davidchan.android.constadorapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mBotonConteo = (Button) findViewById(R.id.botonConteo);
    Button mBotonReiniciar = (Button) findViewById(R.id.botonReiniciar);
    EditText mEditTextCotenido = (EditText) findViewById(R.id.contenido);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBotonConteo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                String sContador = mEditTextCotenido.getText().toString();
                int contador = Integer.parseInt(sContador);
                contador++;
                sContador = String.valueOf(contador);
                mEditTextCotenido.setText(sContador);

            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                mEditTextCotenido.setText(0);

            }
        });



    }
}

