package com.sup.administrator.myandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
 EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b,b1;
    String getName,getAdno,getMob,getEmail,getUname,getPass,getCpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.adno);
        ed3=(EditText)findViewById(R.id.mob);
        ed4=(EditText)findViewById(R.id.email);
        ed5=(EditText)findViewById(R.id.username);
        ed6=(EditText)findViewById(R.id.pass);
        ed7=(EditText)findViewById(R.id.confirmpass);
        b=(Button)findViewById(R.id.register);
        b1=(Button)findViewById(R.id.alregis);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getName = ed1.getText().toString();
                getAdno = ed2.getText().toString();
                getMob = ed3.getText().toString();
                getEmail = ed4.getText().toString();
                getUname = ed5.getText().toString();
                getPass = ed6.getText().toString();
                getCpass = ed7.getText().toString();

                if (getPass.equals(getCpass)) {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getAdno, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getMob, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getEmail, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getUname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getPass, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getCpass, Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "Password and confirm Password doesnot match", Toast.LENGTH_LONG).show();
                }
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(e);
            }
        });

    }
}
