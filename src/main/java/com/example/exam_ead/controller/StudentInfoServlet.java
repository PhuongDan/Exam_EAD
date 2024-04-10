package com.example.exam_ead.controller;


import com.example.exam_ead.entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/studentInfo")
public class StudentInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sis");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<Student> students = entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();

        request.setAttribute("students", students);
        request.getRequestDispatcher("studentInfo.jsp").forward(request, response);

        entityManager.close();
    }
}

