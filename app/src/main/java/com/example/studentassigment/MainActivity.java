package com.example.studentassigment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> stdlist = new ArrayList<>();
    RecyclerView Std_v;
    StudentAdapter stdAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        Std_v = findViewById(R.id.std_id);
        Std_v.setLayoutManager(new LinearLayoutManager(this));
        stdAdapter = new StudentAdapter(this ,stdlist );
        Std_v.setAdapter(stdAdapter);




    }
    private void initData() {
        stdlist . add(new Student("Student ID : 1","Student Name : Aya" , "Student Level : Graduated" , "Student Average : 93%"));
        stdlist . add(new Student("Student ID : 2","Student Name : Yara" , "Student Level : 5" , "Student Average : 91%"));
        stdlist . add(new Student("Student ID : 3","Student Name : Osama" , "Student Level : 4" , "Student Average : 88%"));
        stdlist . add(new Student("Student ID : 4","Student Name : Asil" , "Student Level : 2" , "Student Average : 96%"));
        stdlist . add(new Student("Student ID : 5","Student Name : Ahmad" , "Student Level : Class 12" , "Student Average : 98%"));

    }

}
