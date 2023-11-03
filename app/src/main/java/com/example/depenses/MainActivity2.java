package com.example.depenses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {
    EditText edittextmontant, edittextdate;
    Spinner spCat;
    Button btnAj2;
    ArrayList<String> colDep = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent it= getIntent();
        edittextmontant=findViewById(R.id.editextmontant);
        edittextdate=findViewById(R.id.editextDate);
        spCat=findViewById(R.id.spcat);
        btnAj2=findViewById(R.id.btnAj2);
        btnAj2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String montant = edittextmontant.getText().toString();
                String date = edittextdate.getText().toString();
                String category = spCat.getSelectedItem().toString();

                // Create an expense string and add it to the ArrayList
                String expense = "Montant: " + montant + ", Date: " + date + ", Category: " + category;
                colDep.add(expense);

                Intent intent = new Intent(MainActivity2.this, Listrecherche.class);
                intent.putStringArrayListExtra("dataList", colDep);
                startActivity(intent);


            }
        });

    }




}
