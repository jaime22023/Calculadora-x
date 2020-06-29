package com.example.calculadorax;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  String number ="";
    public double num1 = 0;
    private double num2 = 0;
    protected String symbol;


    private TextView solucion;
    private Button keyPad1, keyPad2, keyPad3, keyPad4, keyPad5, keyPad6, keyPad7, keyPad8, keyPad9, keyPad0;
    private Button keyPadSum, keyPadresta, keyPadMultiply, KeyPaddivide, keyborrar, keyborrart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        solucion =  findViewById(R.id.solucion);

        keyPad1 = findViewById(R.id.num_uno);
        keyPad2 = findViewById(R.id.num_dos);
        keyPad3 = findViewById(R.id.num_tres);
        keyPad4 = findViewById(R.id.num_cuatro);
        keyPad5 = findViewById(R.id.num_cinco);
        keyPad6 = findViewById(R.id.num_seis);
        keyPad7 = findViewById(R.id.num_siete);
        keyPad8 = findViewById(R.id.num_ocho);
        keyPad9 = findViewById(R.id.num_nueve);
        keyPad0 = findViewById(R.id.num_cero);

        keyPadSum = findViewById(R.id.num_sum);
        keyPadresta = findViewById(R.id.num_resta);
        keyPadMultiply = findViewById(R.id.num_multiply);
        KeyPaddivide = findViewById(R.id.num_divide);
        keyborrar = findViewById(R.id.num_borrar);
        keyborrart= findViewById(R.id.num_borrart);
        //listener for button

        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);
        keyPad0.setOnClickListener(this);
        keyPadSum.setOnClickListener(this);
        keyPadresta.setOnClickListener(this);
        KeyPaddivide.setOnClickListener(this);
        keyPadMultiply.setOnClickListener(this);
        keyborrar.setOnClickListener(this);
        keyborrart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                number = number + "0";
                solucion.setText(number);
                break;

            case R.id.num_uno:
                number = number + "1";
                solucion.setText(number);
                break;

            case R.id.num_dos:
                number = number + "2";
                solucion.setText(number);
                break;

            case R.id.num_tres:
                number = number + "3";
                solucion.setText(number);
                break;

            case R.id.num_cuatro:
                number = number + "4";
                solucion.setText(number);
                break;

            case R.id.num_cinco:
                number = number + "5";
                solucion.setText(number);
                break;

            case R.id.num_seis:
                number = number + "6";
                solucion.setText(number);
                break;

            case R.id.num_siete:
                number = number + "7";
                solucion.setText(number);
                break;

            case R.id.num_ocho:
                number = number + "8";
                solucion.setText(number);
                break;

            case R.id.num_nueve:
                number = number + "9";
                solucion.setText(number);
                break;

            case R.id.num_sum:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_resta:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_divide:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_multiply:
                symbol = "X";
                num1 = Integer.parseInt(number);
                number = "";
                break;




            switch (symbol){
                case "+":
                    solucion.setText("solucion: " + (num1 + num2));
                    num2 = Integer.parseInt(number);
                    break;
                case "-":
                    solucion.setText("solucion: " + (num1 - num2));
                    num2 = Integer.parseInt(number);
                    break;
                case "/":
                    solucion.setText("solucion: " + (num1 / num2));
                    num2 = Integer.parseInt(number);
                    break;
                case "X":
                    solucion.setText("solucion: " + (num1 * num2));
                    num2 = Integer.parseInt(number);
                    break;
                default:
                    throw new IllegalStateException("solucion: " +(number) );
            }

            case R.id.num_borrar:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                solucion.setText("C");
                break;

            case R.id.num_borrart:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                break;


        }
        break;
    }
}
