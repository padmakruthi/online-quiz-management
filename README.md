# Online Quiz Management System
**Java Full Stack & DevOps Technical Assessment Portal**

---

### Project Overview
A complete, lightweight, human-crafted Dynamic Web Project built for Eclipse and Apache Tomcat. It provides a focused assessment testing Core Java, Spring Boot, JPA/Hibernate, RESTful Web Services, Docker, Kubernetes, CI/CD, and Git.

---

### Key Features
1. **Curated Technical Questions (Java Full Stack & DevOps)**:
   - **Core Java**: JVM memory architecture (Metaspace), String pool immutability, `ConcurrentHashMap` concurrency mechanisms, Java 8 Stream API (`map` vs `flatMap`).
   - **Java Full Stack**: Spring Boot annotations (`@SpringBootApplication`), `@RestController` vs `@Controller`, Spring Bean singleton scope, Spring Boot Actuator, Hibernate N+1 select problem & `JOIN FETCH`, HTTP idempotency (PUT vs POST), CORS browser security, stateless JWT authentication.
   - **DevOps**: Docker `CMD` vs `ENTRYPOINT`, multi-stage Docker builds for Spring Boot, Kubernetes Pods and LoadBalancer Services, CI/CD automated pipeline stages, `git merge` vs `git rebase`, Linux `jps` process diagnostics, and Maven lifecycle (`mvn clean package`).

2. **Last Marks & Score Tracking**:
   - Displays the candidate's score, percentage, and qualification status (`PASSED` at 60%+, or `NEEDS IMPROVEMENT`).
   - Stores and compares previous attempt marks against the current attempt (`+X marks improvement`).
   - Provides an itemized breakdown of Correct, Incorrect, and Unattempted questions.

3. **Retry Option**:
   - A dedicated **Retry Quiz** button on the results page.
   - Resets questions for a clean attempt while preserving and displaying the last scored marks.
   - Allows students/candidates to learn from their mistakes and retake the test.

4. **Detailed Answer Review & Concept Explanations**:
   - Displays every question with the candidate's chosen answer vs. the correct answer.
   - Provides in-depth explanations for why the correct option is right.

5. **Simple, Human-Made UI**:
   - Clean, purposeful design crafted with pure semantic HTML and CSS.
   - No external icon packs (no FontAwesome, no SVG clutter, no emojis in buttons).
   - Fully self-contained: requires no external CDNs or internet access to render cleanly.

---

### How to Run in Eclipse

1. **Open Eclipse**:
   - Launch Eclipse IDE for Enterprise Java and Web Developers (or Eclipse IDE with WTP).

2. **Import Project**:
   - Click `File` -> `Import...`
   - Select `General` -> `Existing Projects into Workspace` -> Click `Next`.
   - Set **Select root directory** to:
     ```
     C:\Users\user\Desktop\Kruthi\iv\SN_2026\Online Quiz Management
     ```
   - Make sure **Online Quiz Management** is checked -> Click `Finish`.

3. **Run on Apache Tomcat**:
   - In the `Project Explorer`, right-click on the project **Online Quiz Management** (or right-click `src/main/webapp/index.jsp`).
   - Click `Run As` -> `Run on Server`.
   - Select your configured Apache Tomcat server (Tomcat 8.5 / 9 / 10).
   - Click `Finish`.

4. **Access in Browser**:
   - Open your web browser to:
     ```
     http://localhost:8080/Online_Quiz_Management/
     ```

---

### Project File Structure
```
Online Quiz Management/
├── .classpath
├── .project
├── .settings/
│   ├── org.eclipse.jdt.core.prefs
│   ├── org.eclipse.wst.common.component
│   └── org.eclipse.wst.common.project.facet.core.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/quiz/
│       │       ├── model/
│       │       │   ├── Question.java
│       │       │   ├── QuestionReview.java
│       │       │   └── QuizResult.java
│       │       └── service/
│       │           └── QuizRepository.java
│       └── webapp/
│           ├── css/
│           │   └── style.css
│           ├── WEB-INF/
│           │   ├── classes/
│           │   └── web.xml
│           ├── index.jsp
│           ├── startQuiz.jsp
│           ├── quiz.jsp
│           ├── submitQuiz.jsp
│           ├── result.jsp
│           └── retry.jsp
└── README.md
```
