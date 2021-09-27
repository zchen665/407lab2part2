package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickadd(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.textoperand1);
        EditText myTextField2 = (EditText) findViewById(R.id.textoperand2);
        double ope1 = Double.parseDouble(myTextField1.getText().toString());
        double ope2 = Double.parseDouble(myTextField2.getText().toString());
        double res = ope1 + ope2;
        goToActivity2(String.valueOf((res)));
    }
    public void clicksub(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.textoperand1);
        EditText myTextField2 = (EditText) findViewById(R.id.textoperand2);
        double ope1 = Double.parseDouble(myTextField1.getText().toString());
        double ope2 = Double.parseDouble(myTextField2.getText().toString());
        double res = ope1 - ope2;
        goToActivity2(String.valueOf((res)));
    }
    public void clickmult(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.textoperand1);
        EditText myTextField2 = (EditText) findViewById(R.id.textoperand2);
        double ope1 = Double.parseDouble(myTextField1.getText().toString());
        double ope2 = Double.parseDouble(myTextField2.getText().toString());
        double res = ope1 * ope2;
        goToActivity2(String.valueOf((res)));
    }
    public void clickdiv(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.textoperand1);
        EditText myTextField2 = (EditText) findViewById(R.id.textoperand2);
        double ope1 = Double.parseDouble(myTextField1.getText().toString());
        double ope2 = Double.parseDouble(myTextField2.getText().toString());
        double res = ope1 / ope2;
        goToActivity2(String.valueOf((res)));
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}