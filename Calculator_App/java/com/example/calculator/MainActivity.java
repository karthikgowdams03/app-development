package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.tbnum1);
        num2 = (EditText) findViewById(R.id.tbnum2);
    }

    public void Add(View view) {
        float ans = 0;
        ans = Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());
        Toast.makeText(getApplicationContext(), "Answer = " + ans + "\n" + "Thank you", Toast.LENGTH_SHORT).show();
    }

    public void Subtract(View view) {
        float ans = 0;

        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
       
            ans = n1-n2;
        
        Toast.makeText(getApplicationContext(), "Answer = " + ans + "\n" + "Thank you", Toast.LENGTH_SHORT).show();
    }

    public void Multiply(View view) {
        float ans = 0;
        ans = Float.parseFloat(num1.getText().toString()) * Float.parseFloat(num2.getText().toString());
        Toast.makeText(getApplicationContext(), "Answer = " + ans + "\n" + "Thank you", Toast.LENGTH_SHORT).show();
    }

    public void Divide(View view) {
        float ans = 0;
        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
        if (n2 == 0) {
            Toast.makeText(getApplicationContext(), "Divide by Zero error" + "\n" + "Thank you", Toast.LENGTH_SHORT).show();
        } else {
            ans = n1 / n2;

            Toast.makeText(getApplicationContext(), "Answer = " + ans + "\n" + "Thank you", Toast.LENGTH_SHORT).show();
        }
    }
    public void Mod(View view) {
        float ans = 0;
        ans = Float.parseFloat(num1.getText().toString()) % Float.parseFloat(num2.getText().toString());
        Toast.makeText(getApplicationContext(), "Answer = " + ans + "\n" + "Thank you", Toast.LENGTH_SHORT).show();
    }
}
