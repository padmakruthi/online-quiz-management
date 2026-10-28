package com.quiz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates the overall result of a quiz attempt, including
 * score, previous attempt score for comparison, counts, and item reviews.
 */
public class QuizResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private String candidateName;
    private String category;
    private int totalQuestions;
    private int correctCount;
    private int wrongCount;
    private int unattemptedCount;
    private int score; // 1 mark per correct answer
    private double percentage;
    private String status; // "Passed" or "Needs Improvement"
    private Integer previousScore; // marks scored in the last attempt before retry
    private Integer previousTotal;
    private int attemptNumber;
    private List<QuestionReview> reviews = new ArrayList<>();

    public QuizResult() {
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    public int getWrongCount() {
        return wrongCount;
    }

    public void setWrongCount(int wrongCount) {
        this.wrongCount = wrongCount;
    }

    public int getUnattemptedCount() {
        return unattemptedCount;
    }

    public void setUnattemptedCount(int unattemptedCount) {
        this.unattemptedCount = unattemptedCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPreviousScore() {
        return previousScore;
    }

    public void setPreviousScore(Integer previousScore) {
        this.previousScore = previousScore;
    }

    public Integer getPreviousTotal() {
        return previousTotal;
    }

    public void setPreviousTotal(Integer previousTotal) {
        this.previousTotal = previousTotal;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public List<QuestionReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<QuestionReview> reviews) {
        this.reviews = reviews;
    }

    public void addReview(QuestionReview review) {
        this.reviews.add(review);
    }

    public boolean hasPreviousAttempt() {
        return previousScore != null;
    }

    public int getScoreDifference() {
        if (previousScore == null) return 0;
        return score - previousScore;
    }
}
