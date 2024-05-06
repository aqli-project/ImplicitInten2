package com.example.implicitinten;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void tampilTelepon(View view){
        Intent teleponIntent= new Intent(Intent.ACTION_DIAL);
        startActivities(new Intent[]{teleponIntent});
    }

    public void tampilSms(View view){
        Intent smsIntent = new Intent(Intent.ACTION_MAIN);
        smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivities(new Intent[]{smsIntent});
    }

    public void tampilKalender(View  view){
        Intent  kalenderIntent = new Intent(Intent.ACTION_MAIN);
        kalenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivities(new Intent[]{kalenderIntent});
    }

    public void tampilBrowser(View view){
        Intent browserIntent = new Intent(Intent.ACTION_MAIN);
        browserIntent.addCategory(Intent.CATEGORY_APP_BROWSER);
        startActivities(new Intent[]{browserIntent});
    }

    public void tampilKalkulator(View view){
        try {
            Intent kalkulatorIntent =  new Intent(Intent.ACTION_MAIN);
            kalkulatorIntent.addCategory(Intent.CATEGORY_LAUNCHER);

            ComponentName cn = new ComponentName("com.android.calculator2", "com.android.calculator2.Calculator");
            kalkulatorIntent.setComponent(cn);

            startActivities(new Intent[]{kalkulatorIntent});
        }
        catch (ActivityNotFoundException anfe){
            Toast.makeText(getApplicationContext(), "Aplikasi tidak ditemukan", Toast.LENGTH_LONG).show();
        }
    }

    public void tampilKontak(View view){
        Intent kontakIntent = new Intent(Intent.ACTION_MAIN);
        kontakIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivities(new Intent[]{kontakIntent});
    }

    public void tampilGaleri(View view){
        Intent galeriIntent = new Intent(Intent.ACTION_MAIN);
        galeriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivities(new Intent[]{galeriIntent});
    }

    public Void tampilWiFi(View view){
        Intent wifiIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivities(new Intent[]{wifiIntent});
        return null;
    }

    public void tampilSound(View view){
        Intent soundIntent = new Intent(Settings.ACTION_SOUND_SETTINGS);
        startActivities(new Intent[]{soundIntent});
    }

    public void tampilAirplane(View view){
        Intent airplaneIntent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        startActivities(new Intent[]{airplaneIntent});
    }

    public void tampilAplikasi(View view){
        Intent aplikasiIntent = new Intent(Settings.ACTION_APPLICATION_SETTINGS);
        startActivities(new Intent[]{aplikasiIntent});
    }
    public void tampilBluetooth(View view){
        Intent bluetoothIntent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivities(new Intent[]{bluetoothIntent});
    }



}