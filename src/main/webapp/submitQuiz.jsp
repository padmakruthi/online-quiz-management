<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.quiz.model.Question" %>
<%@ page import="com.quiz.model.QuizResult" %>
<%@ page import="com.quiz.service.QuizRepository" %>
<%
    List<Question> questions = (List<Question>) session.getAttribute("quizQuestions");
    String candidateName = (String) session.getAttribute("candidateName");
    String category = (String) session.getAttribute("quizCategory");
    Integer attemptNumber = (Integer) session.getAttribute("attemptNumber");
    Integer lastScore = (Integer) session.getAttribute("lastScore");
    Integer lastTotal = (Integer) session.getAttribute("lastTotal");

    if (questions == null || questions.isEmpty()) {
        response.sendRedirect("index.jsp");
        return;
    }

    if (attemptNumber == null) {
        attemptNumber = 1;
    }

    // Collect submitted choices
    Map<Integer, Integer> answers = new HashMap<Integer, Integer>();
    for (Question q : questions) {
        String param = request.getParameter("q_" + q.getId());
        if (param != null && !param.trim().isEmpty()) {
            try {
                int selected = Integer.parseInt(param.trim());
                answers.put(q.getId(), selected);
            } catch (NumberFormatException ignored) {
            }
        }
    }

    // Evaluate answers
    QuizResult result = QuizRepository.evaluateQuiz(
        candidateName,
        category,
        questions,
        answers,
        lastScore,
        lastTotal,
        attemptNumber
    );

    // Save evaluated result to session
    session.setAttribute("currentResult", result);
    session.setAttribute("lastResult", result);

    // Redirect to result presentation page (PRG pattern)
    response.sendRedirect("result.jsp");
%>
