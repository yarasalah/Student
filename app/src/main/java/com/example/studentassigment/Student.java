package com.example.studentassigment;

public class Student {
    String id;
    String name;
    String level;
    String avg;

    public Student(String id , String name, String level, String avg){
        this.id=id;
        this.name=name;
        this.level=level;
        this.avg=avg;
    }

    public String getAvg() {return avg; }

    public String getId() {return id; }

    public String getLevel() {return level; }

    public String getName() {return name; }

    public void setAvg(String avg) {this.avg = avg; }

    public void setId(String id) {this.id = id; }

    public void setLevel(String level) {this.level = level; }

    public void setName(String name) {this.name = name; }
}
