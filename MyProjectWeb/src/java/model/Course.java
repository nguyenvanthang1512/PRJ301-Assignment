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
public class Course {
    private int id;
    private Lecturer lecturer;
    private String name;
    private Semester semester;
    private Subject subject;
    private ArrayList<Student> students = new ArrayList<>();

    public int getId() {
        return id;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public String getName() {
        return name;
    }

    public Semester getSemester() {
        return semester;
    }

    public Subject getSubject() {
        return subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
}
