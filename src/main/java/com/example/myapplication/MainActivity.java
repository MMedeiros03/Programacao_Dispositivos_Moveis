package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber, editTextNumber2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView3 = findViewById(R.id.textView3);
    }

    public void onSorteio(View v){
        int valor1,valor2;
        valor1 = Integer.parseInt((editTextNumber.getText().toString()));
        valor2 = Integer.parseInt((editTextNumber2.getText().toString()));
        int random = new Random().nextInt(valor2-valor1)+1+valor1;
        textView3.setText(Integer.toString(random));
    }
}