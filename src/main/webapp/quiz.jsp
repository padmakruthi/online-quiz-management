<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
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
        // Fallback: If session expired or accessed directly, initialize defaults
        questions = QuizRepository.getAllQuestions();
        session.setAttribute("quizQuestions", questions);
        if (candidateName == null) candidateName = "Student";
        if (category == null) category = "ALL";
        if (attemptNumber == null) attemptNumber = 1;
        session.setAttribute("candidateName", candidateName);
        session.setAttribute("quizCategory", category);
        session.setAttribute("attemptNumber", attemptNumber);
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assessment in Progress - Online Quiz Management</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript">
        function clearRadio(groupName) {
            var radios = document.getElementsByName(groupName);
            for (var i = 0; i < radios.length; i++) {
                radios[i].checked = false;
            }
        }

        function confirmSubmit() {
            return confirm("Are you sure you want to finish and submit your answers?");
        }
    </script>
</head>
<body>

<div class="container">
    <div class="header">
        <h1>Online Quiz Assessment</h1>
        <p>Technical Assessment Portal - Java Full Stack & DevOps</p>
    </div>

    <div class="meta-bar">
        <div class="meta-item">Candidate: <strong><%= candidateName %></strong></div>
        <div class="meta-item">Module: <strong><%= category %></strong></div>
        <div class="meta-item">Total Questions: <strong><%= questions.size() %></strong></div>
        <div class="meta-item">Attempt: <strong>#<%= attemptNumber %></strong></div>
        <% if (lastScore != null && lastTotal != null) { %>
            <div class="meta-item" style="color: #744210;">Last Marks: <strong><%= lastScore %> / <%= lastTotal %></strong></div>
        <% } %>
    </div>

    <% if (lastScore != null && lastTotal != null) { %>
        <div class="banner banner-previous">
            <strong>Retry Mode Active:</strong> You scored <strong><%= lastScore %> out of <%= lastTotal %></strong> on your previous attempt. Re-answer the questions below to improve your score!
        </div>
    <% } %>

    <form action="submitQuiz.jsp" method="post" onsubmit="return confirmSubmit();">
        <%
            int qNum = 1;
            for (Question q : questions) {
                String inputName = "q_" + q.getId();
        %>
            <div class="question-card" id="qcard_<%= q.getId() %>">
                <div class="question-header">
                    <span class="question-number">Question <%= qNum %> of <%= questions.size() %></span>
                    <span class="topic-badge"><%= q.getTopic() %></span>
                </div>

                <div class="question-text">
                    <%= q.getQuestionText() %>
                </div>

                <% if (q.getCodeSnippet() != null && !q.getCodeSnippet().trim().isEmpty()) { %>
                    <pre class="code-snippet"><%= q.getCodeSnippet() %></pre>
                <% } %>

                <div class="options-list">
                    <%
                        String[] opts = q.getOptions();
                        String[] letters = {"A", "B", "C", "D"};
                        for (int i = 0; i < opts.length; i++) {
                            String radioId = "q_" + q.getId() + "_opt_" + i;
                    %>
                        <label class="option-item" for="<%= radioId %>">
                            <input type="radio" id="<%= radioId %>" name="<%= inputName %>" value="<%= i %>">
                            <span class="option-text">
                                <span class="option-letter"><%= letters[i] %>.</span>
                                <%= opts[i] %>
                            </span>
                        </label>
                    <% } %>
                </div>

                <div style="margin-top: 8px;">
                    <span class="clear-link" onclick="clearRadio('<%= inputName %>')">Clear selection for this question</span>
                </div>
            </div>
        <%
                qNum++;
            }
        %>

        <div class="btn-group">
            <button type="submit" class="btn btn-primary" style="flex: 2;">Submit Assessment</button>
            <a href="index.jsp" class="btn btn-outline" style="flex: 1;" onclick="return confirm('Exit quiz without submitting? Current progress will be lost.');">Cancel Assessment</a>
        </div>
    </form>

    <div class="footer">
        <p>Online Quiz Management System | Java Full Stack & DevOps Assessment</p>
    </div>
</div>

</body>
</html>
