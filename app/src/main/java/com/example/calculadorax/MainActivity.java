package com.example.calculadorax;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  String numero ="";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol ="";


    private TextView resultado;
    private Button key_Pad1, key_Pad2, key_Pad3, key_Pad4, key_Pad5, key_Pad6, key_Pad7, key_Pad8, key_Pad9, key_Pad0;
    private Button key_PadSum, key_Padresta, key_PadMultiply, Key_Paddivide, key_padborrar, key_padborrart, key_padigual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultado =  findViewById(R.id.solucion);

        key_Pad1 = findViewById(R.id.num_uno);
        key_Pad2 = findViewById(R.id.num_dos);
        key_Pad3 = findViewById(R.id.num_tres);
        key_Pad4 = findViewById(R.id.num_cuatro);
        key_Pad5 = findViewById(R.id.num_cinco);
        key_Pad6 = findViewById(R.id.num_seis);
        key_Pad7 = findViewById(R.id.num_siete);
        key_Pad8 = findViewById(R.id.num_ocho);
        key_Pad9 = findViewById(R.id.num_nueve);
        key_Pad0 = findViewById(R.id.num_cero);

        key_PadSum = findViewById(R.id.num_sum);
        key_Padresta = findViewById(R.id.num_resta);
        key_PadMultiply = findViewById(R.id.num_multiply);
        Key_Paddivide = findViewById(R.id.num_divide);
        key_padborrar = findViewById(R.id.num_borrar);
        key_padborrart = findViewById(R.id.num_borrart);
        key_padigual = findViewById(R.id.igual);
        //listener for button

        key_Pad1.setOnClickListener(this);
        key_Pad2.setOnClickListener(this);
        key_Pad3.setOnClickListener(this);
        key_Pad4.setOnClickListener(this);
        key_Pad5.setOnClickListener(this);
        key_Pad6.setOnClickListener(this);
        key_Pad7.setOnClickListener(this);
        key_Pad8.setOnClickListener(this);
        key_Pad9.setOnClickListener(this);
        key_Pad0.setOnClickListener(this);
        key_PadSum.setOnClickListener(this);
        key_Padresta.setOnClickListener(this);
        Key_Paddivide.setOnClickListener(this);
        key_PadMultiply.setOnClickListener(this);
        key_padborrar.setOnClickListener(this);
        key_padborrart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                resultado.setText(numero);
                break;

            case R.id.num_uno:
                numero = numero + "1";
                resultado.setText(numero);
                break;

            case R.id.num_dos:
                numero = numero + "2";
                resultado.setText(numero);
                break;

            case R.id.num_tres:
                numero = numero + "3";
                resultado.setText(numero);
                break;

            case R.id.num_cuatro:
                numero = numero + "4";
                resultado.setText(numero);
                break;

            case R.id.num_cinco:
                numero = numero + "5";
                resultado.setText(numero);
                break;

            case R.id.num_seis:
                numero = numero + "6";
                resultado.setText(numero);
                break;

            case R.id.num_siete:
                numero = numero + "7";
                resultado.setText(numero);
                break;

            case R.id.num_ocho:
                numero = numero + "8";
                resultado.setText(numero);
                break;

            case R.id.num_nueve:
                numero = numero + "9";
                resultado.setText(numero);
                break;

            case R.id.num_sum:
                symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_resta:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_divide:
                symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_multiply:
                symbol = "X";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.num_borrart:
                symbol = "";
                numero = "";
                num1 = 0;
                num2 = 0;
                resultado.setText("0");
                break;
            case R.id.num_borrar:
                symbol = "";
                numero = "";
                num1 = -1;
                num2 = -1;
                resultado.setText("");
                break;
            case R.id.igual:
                num2 = Integer.parseInt(numero);

                switch (symbol){
                    case "+":
                        resultado.setText("resultado: " + (num1 + num2));
                        break;
                    case "-":
                        resultado.setText("resultado: " + (num1 - num2));
                        break;
                    case "/":
                        resultado.setText("resultado: " + (num1 / num2));
                        break;
                    case "X":
                        resultado.setText("resultado: " + (num1 * num2));
                        break;

                }

                num1 = 0;
                num2 = 0;
                numero = "";
                break;






        }

    }
}
