package com.quiz.model;

import java.io.Serializable;

/**
 * Represents a single quiz question with multiple choice options.
 */
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String topic;
    private String questionText;
    private String codeSnippet;
    private String[] options;
    private int correctOption; // 0-based index: 0=A, 1=B, 2=C, 3=D
    private String explanation;

    public Question() {
    }

    public Question(int id, String topic, String questionText, String codeSnippet, 
                    String[] options, int correctOption, String explanation) {
        this.id = id;
        this.topic = topic;
        this.questionText = questionText;
        this.codeSnippet = codeSnippet;
        this.options = options;
        this.correctOption = correctOption;
        this.explanation = explanation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCodeSnippet() {
        return codeSnippet;
    }

    public void setCodeSnippet(String codeSnippet) {
        this.codeSnippet = codeSnippet;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getCorrectOptionLetter() {
        switch (correctOption) {
            case 0: return "A";
            case 1: return "B";
            case 2: return "C";
            case 3: return "D";
            default: return "-";
        }
    }
}
