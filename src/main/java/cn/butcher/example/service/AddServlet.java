package cn.butcher.example.service;

import cn.butcher.example.bean.Student;
import cn.butcher.example.dao.Dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: butcher
 * @Date: 2021/01/31/11:52
 */
@WebServlet("/html/add")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String studentID = request.getParameter("studentID");
        String name = request.getParameter("name");
        String birth = request.getParameter("birth");
        String classname = request.getParameter("classname");
        Student student = new Student();
        student.setStudentID(studentID);
        student.setName(name);
        student.setBirth(birth);
        student.setClassname(classname);
        Dao.add(student);
        response.setContentType("text/html;charset=UTF-8");
        response.sendRedirect(request.getContextPath()+"/html/list.html");

    }
}
