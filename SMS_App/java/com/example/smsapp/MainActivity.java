package com.example.smsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import androidx.core.app.ActivityCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.telephony.SmsManager;
import  android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sendbtn;
    EditText txtphoneno;
    EditText txtmessage;
    String phoneno;
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendbtn = (Button) findViewById(R.id.sendBtn);
        txtphoneno = (EditText) findViewById(R.id.tbphone);
        txtmessage = (EditText) findViewById(R.id.tbmessage);

        sendbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSMSMessage();
            }


        });
    }

protected void sendSMSMessage(){
    phoneno=txtphoneno.getText().toString();
    message=txtmessage.getText().toString();
    try{
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(phoneno,null,message,null,null);
        Toast.makeText(getApplicationContext(),"message Sent",Toast.LENGTH_SHORT).show();
    }
    catch (Exception ex)
    {
        Toast.makeText(getApplicationContext(),ex.getMessage().toString(),Toast.LENGTH_LONG).show();
        ex.printStackTrace();
    }





}
}