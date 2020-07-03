package com.camz.dev;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view) {
        EditText campo1 = (EditText) findViewById(R.id.textValor1);
        EditText campo2 = (EditText) findViewById(R.id.textValor2);

        Double valor1 = Double.parseDouble(campo1.getText().toString());
        Double valor2 = Double.parseDouble(campo2.getText().toString());

        Double resultado = valor1 + valor2;

        Toast.makeText(this, "Resultado da Soma:" + resultado, Toast.LENGTH_LONG).show();

        TextView textView = (TextView) findViewById(R.id.textResultado);
        textView.setText("Total: " + resultado);
    }
}
