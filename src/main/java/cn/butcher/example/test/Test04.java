package cn.butcher.example.test;

import cn.butcher.example.bean.Student;
import cn.butcher.example.dao.Dao;

/**
 * @Author: butcher
 * @Date: 2021/01/31/11:47
 */
public class Test04 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("1800300303");
        student.setName("张飞");
        student.setBirth("2000/1/7");
        student.setClassname("18003201");
        Dao.add(student);
    }
}
