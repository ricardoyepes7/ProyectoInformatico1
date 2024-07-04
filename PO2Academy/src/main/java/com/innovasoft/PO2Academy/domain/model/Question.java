package com.innovasoft.PO2Academy.domain.model;

public class Question {
    private final Long id;
    private final String question;
    private final Long idChallenge;
    private final Integer level;

    private Question(QuestionBuilder builder) {
        this.id = builder.id;
        this.question = builder.question;
        this.idChallenge = builder.idChallenge;
        this.level = builder.level;
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Long getIdChallenge() {
        return idChallenge;
    }

    public Integer getLevel() {
        return level;
    }

    public static QuestionBuilder builder() {
        return new QuestionBuilder();
    }

    public static class QuestionBuilder {
        private Long id;
        private String question;
        private Long idChallenge;
        private Integer level;

        public QuestionBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public QuestionBuilder question(String question) {
            this.question = question;
            return this;
        }

        public QuestionBuilder idChallenge(Long idChallenge) {
            this.idChallenge = idChallenge;
            return this;
        }

        public QuestionBuilder level(Integer level) {
            this.level = level;
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }
}
