package com.example.ovd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class proceed extends AppCompatActivity {
    EditText mail,dob,aadhar,pan,pcode,state,district;
    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed);
        mail=findViewById(R.id.mail);
        dob=findViewById(R.id.dob);
        aadhar=findViewById(R.id.aadhar);
        pan=findViewById(R.id.pan);
        pcode=findViewById(R.id.pcode);
        state=findViewById(R.id.state);
        district=findViewById(R.id.district);
        proceed=findViewById(R.id.proceed);
    }
    public void proceed(View view)
    {
        Intent i=new Intent(proceed.this,proceed2.class);
        startActivity(i);

    }
}