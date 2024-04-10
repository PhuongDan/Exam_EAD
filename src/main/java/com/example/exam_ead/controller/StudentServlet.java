package com.example.exam_ead.controller;

import com.example.exam_ead.entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;


@WebServlet("/addStudent")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentCode = request.getParameter("studentCode");
        String fullName = request.getParameter("fullName");
        String address = request.getParameter("address");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sis");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Student student = new Student();
        student.setStudentCode(studentCode);
        student.setFullName(fullName);
        student.setAddress(address);

        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();

        response.sendRedirect("studentInfo.jsp"); // Redirect to a success page
    }
}

