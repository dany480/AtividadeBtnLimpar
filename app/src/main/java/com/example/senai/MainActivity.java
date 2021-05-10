package com.example.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Fazendo um OnCreate.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickMostrar(View v){
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);


        Toast.makeText(MainActivity.this, "" + editText.getText() + " " + editText2.getText(), Toast.LENGTH_LONG).show();

    }

    public void onClickLimpar(View r){

        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);

        editText.setText(null);
        editText2.setText(null);

        editText.setText("");
        editText2.setText("");

        editText.requestFocus();


    }

}