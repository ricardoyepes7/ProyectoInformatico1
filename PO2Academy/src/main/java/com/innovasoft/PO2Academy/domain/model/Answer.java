package com.innovasoft.PO2Academy.domain.model;

public class Answer {
    private Long id;
    private String optionAnswer;
    private Long questionId;
    private boolean isCorrect;

    public Answer(Long id, String optionAnswer, Long questionId, boolean isCorrect) {
        this.id = id;
        this.optionAnswer = optionAnswer;
        this.questionId = questionId;
        this.isCorrect = isCorrect;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionAnswer() {
        return optionAnswer;
    }

    public void setOptionAnswer(String optionAnswer) {
        this.optionAnswer = optionAnswer;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
