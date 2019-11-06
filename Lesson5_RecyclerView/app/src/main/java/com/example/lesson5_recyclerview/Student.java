package com.example.lesson5_recyclerview;

public class Student {
    private int avt;
    private String name;
    public Student(int avt , String name){
        avt = avt;
        name = name;
    }
    public void setAvt(int avt ){
        avt = avt;
    }
    public int getAvt(){
        return avt;
    }
    public void setName(String name){
        name = name;
    }
    public String getName(){
        return name;
    }
}
