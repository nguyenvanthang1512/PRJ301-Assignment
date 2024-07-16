/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thangPC
 */
public class Course {

    private int cid;
    private int cname;
    private int id;
    private int subid;
    private int semid;

    public Course(int cid, int cname, int id, int subid, int semid) {
        this.cid = cid;

        this.cname = cname;
        this.id = id;
        this.subid = subid;
        this.semid = semid;
    }

    public Course() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCname() {
        return cname;
    }

    public void setCname(int cname) {
        this.cname = cname;
    }

    public int getLid() {
        return id;
    }

    public void setLid(int id) {
        this.id = id;
    }

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public int getSemid() {
        return semid;
    }

    public void setSemid(int semid) {
        this.semid = semid;
    }

}
