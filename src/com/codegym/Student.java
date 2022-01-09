package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String collage = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollage() {
        return collage;
    }

    public static void setCollage(String collage) {
        Student.collage = collage;
    }
    static void change(){
        collage = "CODEGYM";
    }
    void display(){
        System.out.println(rollno +" "+name + ", "+collage);
    }
}
