package com.example.lesson5_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import static android.widget.RelativeLayout.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(R.drawable.dat , "Trinh Van Dat"));
        arr.add(new Student(R.drawable.viet, "Ngo Hoang Viet"));
        arr.add(new Student(R.drawable.ninh, "Vu Quang Ninh"));
        arr.add(new Student(R.drawable.hieu , "Nguyen Duc Hieu"));
        arr.add(new Student(R.drawable.tuyen , "Vu Van Tuyen"));
        StudentList studentList = new StudentList(arr , getApplicationContext());
        recyclerView.setAdapter(studentList);
    }
}
