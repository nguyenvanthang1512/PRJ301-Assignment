/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author thangPC
 */
public class Student {
    private int id;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Grade> grades = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }
    
}
