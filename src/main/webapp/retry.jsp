<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.quiz.model.QuizResult" %>
<%
    QuizResult currentResult = (QuizResult) session.getAttribute("currentResult");
    if (currentResult != null) {
        // Save the marks from this attempt as the last marks
        session.setAttribute("lastScore", currentResult.getScore());
        session.setAttribute("lastTotal", currentResult.getTotalQuestions());
        session.setAttribute("lastResult", currentResult);
    }

    Integer attemptNumber = (Integer) session.getAttribute("attemptNumber");
    if (attemptNumber == null) {
        attemptNumber = 1;
    }
    session.setAttribute("attemptNumber", attemptNumber + 1);

    // Remove current result so fresh evaluation can take place
    session.removeAttribute("currentResult");

    // Redirect to quiz page
    response.sendRedirect("quiz.jsp");
%>
