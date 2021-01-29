package com.example.ovd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ov2 extends AppCompatActivity {
    EditText email,pass;
    CheckBox cb;
Button btn,signup,fpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ov2);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        cb=findViewById(R.id.cb);
        fpass=findViewById(R.id.fpass);
        btn=findViewById(R.id.proceed);
        //Login Butoon above
        signup=findViewById(R.id.signup);
        btn.setBackgroundResource(R.drawable.roundrecctangle_layout);

    }
    public void forpas(View view)
    {
        Intent i=new Intent(ov2.this,forgpas.class);
        startActivity(i);
    }
    public void logon(View view)
    {
        if (email.getText().toString().equals("POS000001") && pass.getText().toString().equals("123456")) {
            Toast.makeText(ov2.this, "Logged In Successfully",
                    Toast.LENGTH_SHORT).show();
            Intent i1 = new Intent(ov2.this, profile.class);
            startActivity(i1);
        }
        else{
            Toast.makeText(ov2.this, "Username or password is not correct",
                    Toast.LENGTH_SHORT).show();
        }

    }
    public void signup(View view)
    {
        Intent i2=new Intent(ov2.this,signup.class);
        startActivity(i2);
    }
}