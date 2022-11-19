
package com.example.studentregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText names,usns,emails,phones,depts,pswds;
    MyHelper mh;
    SQLiteDatabase mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = (EditText) findViewById(R.id.tbnm);
        usns = (EditText) findViewById(R.id.tbusn);
        emails = (EditText) findViewById(R.id.tbemail);
        phones = (EditText) findViewById(R.id.tbph);
        depts = (EditText) findViewById(R.id.tbdept);
        pswds = (EditText) findViewById(R.id.tbpswd);

        mh=new MyHelper(MainActivity.this,"stdb",null,1);

        mydb=mh.getWritableDatabase();

    }

        public void Save (View view){

            String name = names.getText().toString();
            String namepattern="^[A-Za-z ]+$";

            String usn = usns.getText().toString();
            String usnpattern="^[0-9]{1}[A-Za-z]{2}[0-9]{2}[A-Za-z]{2}[0-9]{3}$";

            String email = emails.getText().toString();
            String emailpattern="^[A-Za-z0-9_]+@[A-Za-z.]{3,}(.com|.in)$";

            String phone = phones.getText().toString();
            String phonepattern="^(6|7|8|9)[0-9]{9}$";

            String dept = depts.getText().toString();
            String deptpattern="^[A-Za-z ]{3,}$";

            String pswd = pswds.getText().toString();
            String pswdpattern="^[A-Za-z0-9]{6,15}$";

            if(!name.matches(namepattern)) {
                if (name.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Name", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Name", Toast.LENGTH_SHORT).show();
                }
            }

            else if(!usn.matches(usnpattern)) {
                if (usn.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter USN", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid USN", Toast.LENGTH_SHORT).show();
                }
            }

            else if(!email.matches(emailpattern)) {
                if (email.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Email", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Email", Toast.LENGTH_SHORT).show();
                }
            }

            else if(!phone.matches(phonepattern)) {
                if (phone.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Phone", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Phone", Toast.LENGTH_SHORT).show();
                }
            }

            else if(!dept.matches(deptpattern)) {
                if (dept.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Department", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Department", Toast.LENGTH_SHORT).show();
                }
            }

            else if(!pswd.matches(pswdpattern)) {
                if (pswd.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Password", Toast.LENGTH_SHORT).show();
                }
            }

           else{

                ContentValues cv = new ContentValues();
                cv.put("stname",name);
                cv.put("usn",usn);
                cv.put("email",email);
                cv.put("phone",phone);
                cv.put("dept",dept);
                cv.put("pswd",pswd);
                long id= mydb.insert("studata",null,cv);

               Toast.makeText(getApplicationContext(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();

           


           }
        }
}