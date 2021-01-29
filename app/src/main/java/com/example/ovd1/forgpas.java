package com.example.ovd1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class forgpas extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgpas);
        btn=findViewById(R.id.proceed);
        btn.setBackgroundResource(R.drawable.roundrecctangle_layout);
    }
}