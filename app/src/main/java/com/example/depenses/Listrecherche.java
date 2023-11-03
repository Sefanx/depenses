package com.example.depenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Listrecherche extends AppCompatActivity {
    ListView listView = findViewById(R.id.lstdep);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listrecherche);
        Intent itrech=getIntent();
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);

    }
}