package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view){

        EditText number = (EditText) findViewById(R.id.Sheqels);
        double sheqels = Double.parseDouble(number.getText().toString());

        double dollar = sheqels *0.26;

        Toast.makeText(this, String.format("%.2f", dollar)+"$", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
