package com.innovasoft.PO2Academy.domain.model;

public class Question {
    private Long id;
    private String question;
    private Long idChallenge ;
    private Integer level;

    public Question(Long id, String question, Long idChallenge, Integer level) {
        this.id = id;
        this.question = question;
        this.idChallenge = idChallenge;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getIdChallenge() {
        return idChallenge;
    }

    public void setIdChallenge(Long idChallenge) {
        this.idChallenge = idChallenge;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
