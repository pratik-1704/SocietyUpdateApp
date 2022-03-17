package com.example.mysocietyupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RulesActivity extends AppCompatActivity {

    ListView listView;
    String[] rules = {"1.Do not park in front of the Gate",
            "2.Don's Spit on Stares ",
            "3.Maintain Peace",
            "4.Don't throw Garbage from Balcony ",
            "5 Don't waste Water",
            "6.Use Sanitizer while Entering the Society ",
            "7.Take care of the Trees and Plants of Society",
            "8.Before announcing any Party inform the Society ",
            "9.Don't play in Society Premises",
            "10.Use Lift Carefully",
            "11.Meeting will held Every Month ",
            "12.Submit Maintainance check before 10."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        listView = findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(RulesActivity.this, android.R.layout.simple_dropdown_item_1line, rules);
        listView.setAdapter(adapter);

    }
}