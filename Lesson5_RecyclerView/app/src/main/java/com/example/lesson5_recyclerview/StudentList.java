package com.example.lesson5_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentList extends RecyclerView.Adapter<StudentList.ViewHolder>{
    ArrayList<Student> studentList;
    Context context;
    public StudentList(ArrayList<Student> studentList , Context context){
        studentList = studentList;
        context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.custom_layout , parent , false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(studentList.get(position).getAvt());
        holder.btn.setText(studentList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        Button btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setUp();

        }
        public void setUp(){
            img = (ImageView) itemView.findViewById(R.id.imv1);
            btn = (Button) itemView.findViewById(R.id.bt1);
        }
    }
}
