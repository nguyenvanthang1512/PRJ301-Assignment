/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import model.Grade;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thangPC
 */
public class GradeDBContext extends DBContext<Grade> {

    public void insertGrade(int sid, int cid, float grades) {
        PreparedStatement stm = null;
        try {
            String sql = "INSERT INTO grades (sid, cid, grade) VALUES (?, ?, ?)";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, sid);
            stm.setInt(2, cid);
            stm.setFloat(cid, grades);
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CourseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<Grade> getGradesByStudentId(int sid) {
        ArrayList<Grade> grades = new ArrayList<>();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM grade WHERE student_id = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, sid);
            rs = stm.executeQuery();
            while (rs.next()){
                Grade grade = new Grade();
                grade.setEid(rs.getInt("eid"));
                grade.setSid(rs.getInt("sid"));
                grade.setScore(rs.getFloat("score"));
                grades.add(grade);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stm != null) stm.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return grades;
    }
    
    public Map<Integer, Float> getAverageGradesByCourse(){
        Map<Integer, Float> avgGrades = new HashMap<>();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT cid, AVG(grade) as avg_grade FROM grades GROUP BY cid";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                avgGrades.put(rs.getInt("cid"), rs.getFloat("avg_grade"));
            }
        } catch (Exception e) {
        } finally {
            try {
            if (rs != null) rs.close();
            if (stm != null) stm.close();
            if (connection != null) connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return avgGrades;
    }

    @Override
    public ArrayList<Grade> all() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Grade get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Grade model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Grade model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Grade model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
