package com.example.depenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCateg;
    Button btnRech;
    Button btnAj;
    Button btnStat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCateg=findViewById(R.id.btnCateg);
        btnRech=findViewById(R.id.btnRech);
        btnAj=findViewById(R.id.btnAJ);
        btnStat=findViewById(R.id.btnStat);

        btnAj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(it);
            }
        });
        btnRech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itrech=new Intent(MainActivity.this, Listrecherche.class);
                startActivity(itrech);
            }
        });
        btnCateg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itcateg=new Intent(MainActivity.this, Categories.class);
                startActivity(itcateg);
            }
        });
           

    }
}