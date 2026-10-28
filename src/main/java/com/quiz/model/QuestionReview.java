package com.quiz.model;

import java.io.Serializable;

/**
 * Stores the candidate's answer review for a single question.
 */
public class QuestionReview implements Serializable {
    private static final long serialVersionUID = 1L;

    private Question question;
    private int selectedOption; // -1 if not attempted, or 0..3
    private boolean isCorrect;

    public QuestionReview() {
    }

    public QuestionReview(Question question, int selectedOption, boolean isCorrect) {
        this.question = question;
        this.selectedOption = selectedOption;
        this.isCorrect = isCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public boolean isAttempted() {
        return selectedOption >= 0 && selectedOption <= 3;
    }

    public String getSelectedOptionLetter() {
        switch (selectedOption) {
            case 0: return "A";
            case 1: return "B";
            case 2: return "C";
            case 3: return "D";
            default: return "Not Answered";
        }
    }

    public String getSelectedOptionText() {
        if (selectedOption >= 0 && selectedOption < question.getOptions().length) {
            return question.getOptions()[selectedOption];
        }
        return "Not Answered";
    }

    public String getCorrectOptionText() {
        int correctIdx = question.getCorrectOption();
        if (correctIdx >= 0 && correctIdx < question.getOptions().length) {
            return question.getOptions()[correctIdx];
        }
        return "-";
    }
}
