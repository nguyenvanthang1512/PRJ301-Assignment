/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.grades;

import dal.CourseDBContext;
import dal.GradeDBContext;
import dal.UserDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Course;
import model.User;

/**
 *
 * @author thangPC
 */
public class GradeController extends HttpServlet {
    private static final long serialversionUID = 1L;
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        CourseDBContext courseDB = new CourseDBContext();
        ArrayList<Course> courses = courseDB.getAllCourse();
        request.setAttribute("course", courses);
        
        UserDBContext userDB = new UserDBContext();
        ArrayList<User> students = userDB.all();
        request.setAttribute("students", students);
        
        request.getRequestDispatcher("font/score/grade.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        int sid = Integer.parseInt(request.getParameter("sid"));
        int cid = Integer.parseInt(request.getParameter("cid"));
        float score = Float.parseFloat(request.getParameter("score"));
        
        GradeDBContext gradeDB = new GradeDBContext();
        gradeDB.insertGrade(sid, cid, score);
        
        response.sendRedirect("grade");
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
