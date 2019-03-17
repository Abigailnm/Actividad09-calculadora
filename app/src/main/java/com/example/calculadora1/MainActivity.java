package com.example.calculadora1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText tv_numero1;
    public EditText tv_numero2;
    public EditText tv_resultado;

    public Double num1 = 0.0;
    public Double num2 = 0.0;
    public Double resultado = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();


    }

    public void initComponents(){

        tv_numero1 = (EditText) findViewById(R.id.tv_numero1);
        tv_numero2 = (EditText) findViewById(R.id.tv_numero2);
        tv_resultado = (EditText) findViewById(R.id.tv_resultado);
    }

    private void valuesCasting(){
        num1 = Double.parseDouble(tv_numero1.getText().toString());
        num2 = Double.parseDouble(tv_numero2.getText().toString());
    }

    public void sumaonClick(View view) {
        try{
            valuesCasting();
            resultado = num1 + num2;
            tv_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error suma:", "Message " + e.getMessage());
            tv_resultado.setText("Error");
        }

    }

    public void restaonClick(View view) {
        try{
            valuesCasting();
            resultado = num1 - num2;
            tv_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error resta:", "Message " + e.getMessage());
            tv_resultado.setText("Error");
        }

    }

    public void multiplicaciononClick(View view) {
        try{
            valuesCasting();
            resultado = num1 * num2;
            tv_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error multi:", "Message " + e.getMessage());
            tv_resultado.setText("Error");
        }

    }


    public void moduloonClick(View view) {
        try{
            valuesCasting();
            resultado = num1 % num2;
            tv_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error modulo:", "Message " + e.getMessage());
            tv_resultado.setText("Error");
        }

    }

    public void onClick(View view) {
        try{
            valuesCasting();
            resultado = num1 / num2;
            tv_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error divi:", "Message " + e.getMessage());
            tv_resultado.setText("Error");
        }

    }}










