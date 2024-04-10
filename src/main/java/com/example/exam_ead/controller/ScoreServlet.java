package com.example.exam_ead.controller;


import com.example.exam_ead.entity.StudentScore;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.persistence.*;
import java.io.IOException;

@WebServlet("/addScore")
public class ScoreServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        int subjectId = Integer.parseInt(request.getParameter("subjectId"));
        double score1 = Double.parseDouble(request.getParameter("score1"));
        double score2 = Double.parseDouble(request.getParameter("score2"));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sis");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        StudentScore studentScore = new StudentScore();
        studentScore.setStudentId(studentId);
        studentScore.setSubjectId(subjectId);
        studentScore.setScore1(score1);
        studentScore.setScore2(score2);

        entityManager.persist(studentScore);
        entityManager.getTransaction().commit();
        entityManager.close();

        response.sendRedirect("studentInfo.jsp"); // Redirect to a success page
    }
}
