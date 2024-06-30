/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;

/**
 *
 * @author thangPC
 */
public class LoginDAL extends DBContext {

    public Account LoginDAL(String user, String pass) {
        String sql = "Select * from Account where [user] = ? and [pass] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, sql);
            st.setString(2, sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt("uid"),
                        rs.getString("user"),
                        rs.getString("pass"), 
                        rs.getInt("isStu"),
                        rs.getInt("isLet"), 
                        rs.getInt("isAdmin"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        LoginDAL dal = new LoginDAL();
        Account list = dal.LoginDAL("bin1512", "123");
        System.out.println(list);
    }

    @Override
    public ArrayList all() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
