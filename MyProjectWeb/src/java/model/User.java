/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thangPC
 */
public class User {

    private int uID;
    private String username;
    private String password;
    private String role;

    public User() {
    }

    public User(int uID, String username, String password, String role) {
        this.uID = uID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return uID;
    }

    public void setId(int uID) {
        this.uID = uID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
