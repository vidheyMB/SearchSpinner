package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.searchspinner.SearchableSpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchableSpinner s = findViewById(R.id.searchViews);

        ArrayList<String> users = new ArrayList<String>();
        users.add("Veniam penatibus");
        users.add("reprehenderit ssssssssssssssssssssssssssssssssssssss");
        users.add("Ullamcorper lacinia");
        users.add("Etiam dis");

       s.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, users));


    }
}