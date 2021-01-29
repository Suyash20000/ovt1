package com.example.ovd1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.ovd1.R;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
            }
        }, SPLASH_SCREEN_TIME_OUT);
        createchannel();
        showNotification();
    }
    public  void createchannel(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            NotificationChannel ch=new NotificationChannel("101","OV Technology ", NotificationManager.IMPORTANCE_DEFAULT);
            ch.setDescription("OV is Running");
            ch.setShowBadge(true);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(ch);
        }
    }
    public void showNotification(){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"101")
                .setSmallIcon(R.drawable.icon).setContentTitle("OV Tech")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentText("OV is Ruuning ")
                .setChannelId("101")
                .setAutoCancel(false);
        NotificationManagerCompat managerCompat=NotificationManagerCompat.from(this);
        managerCompat.notify(101,builder.build());
    }
}

