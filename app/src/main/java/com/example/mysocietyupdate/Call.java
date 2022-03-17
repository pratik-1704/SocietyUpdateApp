package com.example.mysocietyupdate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

public class Call extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private TextView callText,tvCallone,tvCalltwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        //assigning id
        Button callBtn = findViewById(R.id.btnCall);
        callText = findViewById(R.id.tvCall);
        tvCallone = findViewById(R.id.tvCallone);
        tvCalltwo = findViewById(R.id.tvCalltwo);
        Button btnCallone = findViewById(R.id.btnCallone);
        //Initialization
        Button btnCalltwo = findViewById(R.id.btnCalltwo);


        callBtn.setOnClickListener(new View.OnClickListener() {//button clickable
            @Override
            public void onClick(View v) {
                callButton();
            }
        });
        btnCallone.setOnClickListener(new View.OnClickListener() {//button clickable
            @Override
            public void onClick(View v) {
                callButton1();
            }
        });
        btnCalltwo.setOnClickListener(new View.OnClickListener() {//button clickable
            @Override
            public void onClick(View v) {
                callButton2();
            }
        });
    }

    private void callButton() {
        String number = callText.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Call.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Call.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);

            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));

            }
        }
    }
    private void callButton1() {
        String number = tvCallone.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Call.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Call.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);

            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));

            }
        }
    }
    private void callButton2() {
        String number = tvCalltwo.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Call.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Call.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);

            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));

            }
        }
    }




    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                callButton();
                callButton1();
                callButton2();

            } else {
                Toast.makeText(this, "permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}