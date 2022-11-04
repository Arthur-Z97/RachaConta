package br.ulbra.rachaconta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtvalor1, edtvalor2;
Button Calcular, Limpar, btpato;
ImageView patoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtvalor1 = findViewById(R.id.edtV1);
        edtvalor2 = findViewById(R.id.edtV2);
        Calcular = findViewById(R.id.Calcular);
        Limpar = findViewById(R.id.Limpar);
        btpato = findViewById(R.id.btpato);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Valor1, Valor2, div;
                Valor1 = Double.parseDouble(
                        edtvalor1.getText().toString());
                Valor2 = Double.parseDouble(
                        edtvalor2.getText().toString());
                div = Valor1 / Valor2;
                Toast.makeText(MainActivity.this, "O valor para cada é de " +div, Toast.LENGTH_SHORT).show();
            }
        });
        Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtvalor1.setText("");
                edtvalor2.setText("");
            }
        });
        btpato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    }