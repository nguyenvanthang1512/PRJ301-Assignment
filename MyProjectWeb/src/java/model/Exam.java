/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.Date;

/**
 *
 * @author thangPC
 */
public class Exam {
    private int id;
    private Date date;
    private int duration;
    private int aid;

    public Exam() {
    }

    public Exam(int id, Date date, int duration, int aid) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.aid = aid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

   
    
}
