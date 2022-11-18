package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
EditText p;
    EditText t;
    EditText r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=(EditText)findViewById(R.id.tbpriciple);
        t=(EditText)findViewById(R.id.tbtime);
        r=(EditText)findViewById(R.id.tbrate);
    }

    public void Calculate(View view){
        float si=0;
        si=Float.parseFloat(p.getText().toString())*Float.parseFloat(t.getText().toString())*Float.parseFloat(r.getText().toString());
        si=si/100;
        Toast.makeText(getApplicationContext(),
                 "Simple Interest: "+si+"\n"+"Thank You",Toast.LENGTH_SHORT).show();

    }



}