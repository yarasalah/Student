package com.example.studentassigment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Student extends AppCompatActivity {
    TextView idt;
    TextView namet;
    TextView levelt;
    TextView avgt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__student);

        idt= (TextView) findViewById(R.id.std_id);
        namet= findViewById(R.id.std_name);

        levelt= findViewById(R.id.std_level);
        avgt= findViewById(R.id.std_avg);


        String id = getIntent().getStringExtra("ID");
        String name = getIntent().getStringExtra("Name");
        String level = getIntent().getStringExtra("Level");
        String avg = getIntent().getStringExtra("Average");
        idt.setText(id);
        namet.setText(name);
        levelt.setText(level);
        avgt.setText(avg);




    }
}
