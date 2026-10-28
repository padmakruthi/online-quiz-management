package com.quiz.service;

import com.quiz.model.Question;
import com.quiz.model.QuestionReview;
import com.quiz.model.QuizResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Repository containing basic-to-medium level questions on Java Full Stack & DevOps.
 */
public class QuizRepository {

    private static final List<Question> ALL_QUESTIONS = new ArrayList<Question>();

    static {
        // --- 1. CORE JAVA (BASIC TO MEDIUM) ---

        // Q1: OOP Basics
        ALL_QUESTIONS.add(new Question(
            1,
            "Core Java",
            "Which of the following is NOT one of the four fundamental principles of Object-Oriented Programming (OOP) in Java?",
            null,
            new String[]{
                "Encapsulation",
                "Compilation",
                "Inheritance",
                "Polymorphism"
            },
            1,
            "The four main pillars of OOP in Java are Encapsulation, Inheritance, Polymorphism, and Abstraction. Compilation is the process of translating source code into bytecode."
        ));

        // Q2: Final Keyword
        ALL_QUESTIONS.add(new Question(
            2,
            "Core Java",
            "What is the effect of applying the 'final' keyword to a variable in Java?",
            null,
            new String[]{
                "The variable can only be accessed within the same package",
                "The variable's value becomes constant and cannot be reassigned once initialized",
                "The variable is automatically destroyed by the Garbage Collector",
                "The variable can only store primitive numeric values"
            },
            1,
            "When a variable is declared with the 'final' keyword, its value or reference cannot be reassigned after initialization."
        ));

        // Q3: String Comparison
        ALL_QUESTIONS.add(new Question(
            3,
            "Core Java",
            "What is the difference between '==' and the '.equals()' method when comparing two String objects in Java?",
            null,
            new String[]{
                "'==' checks if values are equal, while '.equals()' checks memory addresses",
                "'==' compares object memory references (addresses), while '.equals()' compares the actual text content",
                "Both '==' and '.equals()' behave exactly the same for Strings",
                "'.equals()' only works for primitive data types"
            },
            1,
            "'==' verifies if two references point to the exact same memory location, whereas String.equals() checks if the sequence of characters (content) matches."
        ));

        // Q4: Collections
        ALL_QUESTIONS.add(new Question(
            4,
            "Core Java",
            "Which Java Collection interface implementation stores key-value pairs and does NOT guarantee any specific ordering?",
            null,
            new String[]{
                "ArrayList",
                "TreeSet",
                "HashMap",
                "LinkedList"
            },
            2,
            "HashMap stores elements as key-value pairs (Map interface) and does not guarantee any order of elements over time."
        ));

        // Q5: Exception Handling
        ALL_QUESTIONS.add(new Question(
            5,
            "Core Java",
            "In Java exception handling, which block is guaranteed to execute whether an exception occurs or not?",
            null,
            new String[]{
                "catch block",
                "throw block",
                "finally block",
                "throws clause"
            },
            2,
            "The 'finally' block always executes after try and catch blocks, making it ideal for cleaning up resources like closing streams or database connections."
        ));

        // --- 2. SPRING BOOT & JAVA FULL STACK (BASIC TO MEDIUM) ---

        // Q6: Spring Boot Basics
        ALL_QUESTIONS.add(new Question(
            6,
            "Spring Boot",
            "What is the primary benefit of using Spring Boot compared to the traditional Spring Framework?",
            null,
            new String[]{
                "It eliminates the need to write Java code",
                "It provides auto-configuration, embedded servers (like Tomcat), and starter dependencies for rapid development",
                "It replaces HTML and JavaScript in frontend development",
                "It only works with offline applications"
            },
            1,
            "Spring Boot simplifies Spring development by offering opinionated starter POMs, automatic sensible default configurations, and embedded servlet containers (Tomcat, Jetty)."
        ));

        // Q7: Spring Web Annotations
        ALL_QUESTIONS.add(new Question(
            7,
            "Spring Boot",
            "Which annotation is used on a method in a Spring Boot controller to handle incoming HTTP GET requests?",
            null,
            new String[]{
                "@GetMapping",
                "@PostMapping",
                "@ResponseBody",
                "@PutMapping"
            },
            0,
            "@GetMapping is a shortcut annotation that acts as a synonym for @RequestMapping(method = RequestMethod.GET)."
        ));

        // Q8: Dependency Injection
        ALL_QUESTIONS.add(new Question(
            8,
            "Spring Boot",
            "Which annotation is commonly used in Spring to automatically inject a dependency bean into another component?",
            null,
            new String[]{
                "@Injectable",
                "@Autowired",
                "@Component",
                "@Repository"
            },
            1,
            "@Autowired is used in Spring to automatically wire (inject) collaborating beans by type into fields, constructors, or setter methods."
        ));

        // Q9: REST API HTTP Status
        ALL_QUESTIONS.add(new Question(
            9,
            "Java Full Stack",
            "In RESTful web services, which HTTP status code indicates a successful request?",
            null,
            new String[]{
                "404 Not Found",
                "500 Internal Server Error",
                "200 OK",
                "401 Unauthorized"
            },
            2,
            "HTTP 200 OK is the standard response code for successful HTTP requests (such as GET, PUT, or POST)."
        ));

        // Q10: ORM Concept
        ALL_QUESTIONS.add(new Question(
            10,
            "Java Full Stack",
            "In Java Full Stack backend development, what does 'ORM' stand for?",
            null,
            new String[]{
                "Object-Relational Mapping",
                "Online Resource Management",
                "Ordered Relationship Model",
                "Open Routing Module"
            },
            0,
            "ORM stands for Object-Relational Mapping, a programming technique that maps Java classes (entities) to relational database tables (e.g. Hibernate, EclipseLink)."
        ));

        // Q11: Spring Data JPA
        ALL_QUESTIONS.add(new Question(
            11,
            "Java Full Stack",
            "In Spring Data JPA, which interface provides ready-to-use CRUD methods like save(), findById(), and deleteById()?",
            null,
            new String[]{
                "JpaRepository",
                "HttpServlet",
                "DataSource",
                "EntityManagerFactory"
            },
            0,
            "JpaRepository (extending PagingAndSortingRepository and CrudRepository) provides standard CRUD and pagination operations without writing manual SQL."
        ));

        // Q12: MVC Architecture
        ALL_QUESTIONS.add(new Question(
            12,
            "Java Full Stack",
            "In the Model-View-Controller (MVC) architecture, what is the role of the Controller?",
            null,
            new String[]{
                "It represents the database tables and schemas directly",
                "It displays the visual user interface to the client",
                "It handles incoming HTTP requests, coordinates with service/model layers, and returns responses",
                "It configures hardware networking ports"
            },
            2,
            "The Controller acts as an intermediary: it intercepts incoming user requests, invokes business logic/services, and selects data or views to send back."
        ));

        // --- 3. DEVOPS (BASIC TO MEDIUM) ---

        // Q13: Git Commit
        ALL_QUESTIONS.add(new Question(
            13,
            "DevOps",
            "Which Git command saves staged changes to your local repository along with a descriptive message?",
            null,
            new String[]{
                "git push",
                "git commit -m \"message\"",
                "git add .",
                "git checkout"
            },
            1,
            "'git commit -m \"message\"' records a snapshot of staged changes to the local repository history with a commit message."
        ));

        // Q14: Git Pull
        ALL_QUESTIONS.add(new Question(
            14,
            "DevOps",
            "Which Git command downloads commits from a remote repository and immediately integrates them into your current local branch?",
            null,
            new String[]{
                "git pull",
                "git clone",
                "git init",
                "git status"
            },
            0,
            "'git pull' fetches commits from the remote repository and automatically merges them into the current active local branch."
        ));

        // Q15: Dockerfile
        ALL_QUESTIONS.add(new Question(
            15,
            "DevOps",
            "What is the plain text configuration file that contains the step-by-step instructions to create a Docker container image?",
            null,
            new String[]{
                "docker-compose.yml",
                "Dockerfile",
                "pom.xml",
                "application.properties"
            },
            1,
            "A 'Dockerfile' is a text document containing commands (FROM, COPY, RUN, CMD, etc.) that Docker uses to assemble a container image."
        ));

        // Q16: Docker ps
        ALL_QUESTIONS.add(new Question(
            16,
            "DevOps",
            "Which Docker CLI command is used to list all currently running containers?",
            null,
            new String[]{
                "docker build",
                "docker ps",
                "docker stop",
                "docker run"
            },
            1,
            "'docker ps' lists all active running containers. Adding the '-a' flag ('docker ps -a') lists both running and stopped containers."
        ));

        // Q17: Linux Basics
        ALL_QUESTIONS.add(new Question(
            17,
            "DevOps",
            "In Linux, which command is used to display the contents (files and directories) of the current folder?",
            null,
            new String[]{
                "pwd",
                "cd",
                "ls",
                "mkdir"
            },
            2,
            "'ls' lists directory contents in Linux. 'pwd' shows the current working directory, and 'cd' changes directory."
        ));

        // Q18: CI/CD Meaning
        ALL_QUESTIONS.add(new Question(
            18,
            "DevOps",
            "What does the acronym 'CI/CD' stand for in DevOps methodology?",
            null,
            new String[]{
                "Central Integration / Cloud Deployment",
                "Continuous Integration / Continuous Deployment (or Delivery)",
                "Code Inspection / Continuous Distribution",
                "Container Interface / Container Driver"
            },
            1,
            "CI/CD stands for Continuous Integration and Continuous Deployment (or Continuous Delivery), automating the building, testing, and deployment of software."
        ));

        // Q19: CI/CD Tools
        ALL_QUESTIONS.add(new Question(
            19,
            "DevOps",
            "Which widely used open-source automation tool is popular for building and managing automated CI/CD pipelines?",
            null,
            new String[]{
                "Jenkins",
                "Eclipse IDE",
                "Postman",
                "MySQL Workbench"
            },
            0,
            "Jenkins is a leading open-source automation server used by DevOps teams to build, test, and deploy applications continuously."
        ));

        // Q20: Maven pom.xml
        ALL_QUESTIONS.add(new Question(
            20,
            "DevOps",
            "In an Apache Maven Java project, what is the primary configuration file that manages project dependencies, plugins, and build goals?",
            null,
            new String[]{
                "package.json",
                "build.gradle",
                "pom.xml",
                "web.xml"
            },
            2,
            "'pom.xml' (Project Object Model) is the XML file in Maven that defines project metadata, library dependencies, plugins, and build lifecycle configurations."
        ));
    }

    /**
     * Return all available questions.
     */
    public static List<Question> getAllQuestions() {
        return new ArrayList<Question>(ALL_QUESTIONS);
    }

    /**
     * Get a specific subset of questions based on category filter.
     */
    public static List<Question> getQuestionsByCategory(String category) {
        if (category == null || category.trim().isEmpty() || "ALL".equalsIgnoreCase(category)) {
            return getAllQuestions();
        }

        List<Question> filtered = new ArrayList<Question>();
        for (Question q : ALL_QUESTIONS) {
            if ("JAVA".equalsIgnoreCase(category)) {
                if (q.getTopic().equalsIgnoreCase("Core Java") || q.getTopic().equalsIgnoreCase("Spring Boot") || q.getTopic().equalsIgnoreCase("Java Full Stack")) {
                    filtered.add(q);
                }
            } else if ("DEVOPS".equalsIgnoreCase(category)) {
                if (q.getTopic().equalsIgnoreCase("DevOps")) {
                    filtered.add(q);
                }
            } else if (q.getTopic().equalsIgnoreCase(category)) {
                filtered.add(q);
            }
        }
        return filtered.isEmpty() ? getAllQuestions() : filtered;
    }

    /**
     * Evaluate submitted answers and produce a QuizResult.
     */
    public static QuizResult evaluateQuiz(String candidateName, String category, 
                                         List<Question> questions, 
                                         Map<Integer, Integer> submittedAnswers,
                                         Integer previousScore, Integer previousTotal, int attemptNumber) {
        QuizResult result = new QuizResult();
        result.setCandidateName((candidateName == null || candidateName.trim().isEmpty()) ? "Student" : candidateName.trim());
        result.setCategory(category);
        result.setTotalQuestions(questions.size());
        result.setPreviousScore(previousScore);
        result.setPreviousTotal(previousTotal);
        result.setAttemptNumber(attemptNumber);

        int correctCount = 0;
        int wrongCount = 0;
        int unattemptedCount = 0;

        for (Question q : questions) {
            Integer userChoice = submittedAnswers.get(q.getId());
            boolean isAttempted = (userChoice != null && userChoice >= 0 && userChoice <= 3);

            if (!isAttempted) {
                unattemptedCount++;
                result.addReview(new QuestionReview(q, -1, false));
            } else if (userChoice == q.getCorrectOption()) {
                correctCount++;
                result.addReview(new QuestionReview(q, userChoice, true));
            } else {
                wrongCount++;
                result.addReview(new QuestionReview(q, userChoice, false));
            }
        }

        result.setCorrectCount(correctCount);
        result.setWrongCount(wrongCount);
        result.setUnattemptedCount(unattemptedCount);
        result.setScore(correctCount);

        double percentage = (questions.isEmpty()) ? 0.0 : ((double) correctCount / questions.size()) * 100.0;
        result.setPercentage(Math.round(percentage * 10.0) / 10.0);

        if (percentage >= 60.0) {
            result.setStatus("PASSED");
        } else {
            result.setStatus("NEEDS IMPROVEMENT");
        }

        return result;
    }
}
