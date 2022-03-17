package com.example.mysocietyupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SuggestionActivity extends AppCompatActivity {

    public EditText complainEdit;
    public Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        complainEdit = findViewById(R.id.editTextComplain);
        btnSubmit = findViewById(R.id.btn_Submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SuggestionActivity.this,HomeActivity.class);
                startActivity(intent);

                Toast.makeText(SuggestionActivity.this,"Suggestion recorded Successfully",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}