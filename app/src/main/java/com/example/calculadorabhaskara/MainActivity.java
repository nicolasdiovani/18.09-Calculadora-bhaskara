package com.example.calculadorabhaskara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valora;
    private EditText valorb;
    private EditText valorc;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valora = findViewById(R.id.valora);
        valorb = findViewById(R.id.valorb);
        valorc = findViewById(R.id.valorc);
    }
    public void calcular(View view){
        int A= Integer.parseInt(valora.getText().toString());
        int B= Integer.parseInt(valorb.getText().toString());
        int C= Integer.parseInt(valorc.getText().toString());
        result.setText(String.valueOf((B*(Math.sqrt((B*B)-4*A*C)))/2*A));
    }
}