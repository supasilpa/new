package com.sup.administrator.myandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.password);
        b=(Button)findViewById(R.id.login);
     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Toast.makeText(getApplicationContext(),"HELLO",Toast.LENGTH_LONG).show();
         }
     });
    }
}