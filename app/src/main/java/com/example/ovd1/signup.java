package com.example.ovd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {
EditText firstn,lastn,mob;
Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        firstn=findViewById(R.id.firstn);
        lastn=findViewById(R.id.lastn);
        mob=findViewById(R.id.mob);
        proceed=findViewById(R.id.proceed);
    }
    //proceed button code
    public void pro(View view)
    {
        Intent i=new Intent(signup.this,proceed.class);
        startActivity(i);
    }
}