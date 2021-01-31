package cn.butcher.example.service;

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
 * @Date: 2021/01/31/8:35
 */
@WebServlet("/html/getCount")
public class GetCountServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int count = Dao.getCount();
        if (count<=12){
            count = 1;
        }else {
            count = count/12+1;
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(count);
        out.flush();
        out.close();
    }
}
