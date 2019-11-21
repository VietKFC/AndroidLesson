package com.example.lesson7_database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Student> arrayList;
    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList = new ArrayList<>();
        studentAdapter = new StudentAdapter(arrayList);
        for(int i = 0 ; i < 10 ; i ++) {
            arrayList.add(new Student("Ngo Hoang Viet" , "vietngo1000@gmail.com"));
            arrayList.add(new Student("Vu Van Tuyen" , "tuyenzu@gmail.com"));
        }
        studentAdapter = new StudentAdapter(arrayList);
        recyclerView.setAdapter(studentAdapter);
    }
}
