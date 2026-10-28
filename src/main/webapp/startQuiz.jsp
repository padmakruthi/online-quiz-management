<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.quiz.model.Question" %>
<%@ page import="com.quiz.model.QuizResult" %>
<%@ page import="com.quiz.service.QuizRepository" %>
<%
    String candidateName = request.getParameter("candidateName");
    if (candidateName == null || candidateName.trim().isEmpty()) {
        candidateName = "Student";
    } else {
        candidateName = candidateName.trim();
    }

    String category = request.getParameter("category");
    if (category == null || category.trim().isEmpty()) {
        category = "ALL";
    }

    // Load questions based on selected module
    List<Question> questions = QuizRepository.getQuestionsByCategory(category);

    // Track attempt count
    Integer attemptNumber = (Integer) session.getAttribute("attemptNumber");
    if (attemptNumber == null) {
        attemptNumber = 1;
    }

    session.setAttribute("candidateName", candidateName);
    session.setAttribute("quizCategory", category);
    session.setAttribute("quizQuestions", questions);
    session.setAttribute("attemptNumber", attemptNumber);
    session.setAttribute("userAnswers", new HashMap<Integer, Integer>());

    response.sendRedirect("quiz.jsp");
%>
