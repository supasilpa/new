package com.sup.administrator.myandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
 EditText e1,e2;
    Button b;
    String n1,n2,n3;
    Integer no1,no2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        e1=(EditText)findViewById(R.id.no1);
        e2=(EditText)findViewById(R.id.no2);
        b=(Button)findViewById(R.id.cal);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=e1.getText().toString();
                n2=e2.getText().toString();
                no1=Integer.parseInt(n1);
                no2=Integer.parseInt(n2);
                sum=no1+no2;
                n3=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),n3,Toast.LENGTH_LONG).show();



            }
        });
    }
}
