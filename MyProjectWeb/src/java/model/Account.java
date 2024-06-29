/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thangPC
 */
public class Account {
    private int id;
    private String user;
    private String pass;
    private int isStu;
    private int isLet;
    private int isAdmin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIsStu() {
        return isStu;
    }

    public void setIsStu(int isStu) {
        this.isStu = isStu;
    }

    public int getIsLet() {
        return isLet;
    }

    public void setIsLet(int isLet) {
        this.isLet = isLet;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    
}
