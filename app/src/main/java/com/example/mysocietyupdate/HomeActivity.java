package com.example.mysocietyupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    public TextView  tv_profile,tv_contactus,tv_rules,tv_aboutus,tv_complain,tv_suggestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_profile = findViewById(R.id.tv_profile);
        tv_contactus = findViewById(R.id.tv_contact);
        tv_rules = findViewById(R.id.tv_rules);
        tv_aboutus = findViewById(R.id.tv_aboutus);
        tv_complain = findViewById(R.id.tv_complain);
        tv_suggestion = findViewById(R.id.tv_suggestion);

        tv_complain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainNotesActivity.class);
                startActivity(intent);
            }
        });

        tv_contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Call.class);
                startActivity(intent);
            }
        });

        tv_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, RulesActivity.class);
                startActivity(intent);
            }
        });

        tv_suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });

        tv_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AboutusActivity.class);
                startActivity(intent);
            }
        });

        tv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });


    }
}