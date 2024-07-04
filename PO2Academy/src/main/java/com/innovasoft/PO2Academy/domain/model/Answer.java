package com.innovasoft.PO2Academy.domain.model;

public class Answer {
    private final Long id;
    private final String optionAnswer;
    private final Long questionId;
    private final boolean isCorrect;

    private Answer(AnswerBuilder answerBuilder) {
        this.id = answerBuilder.id;
        this.optionAnswer = answerBuilder.optionAnswer;
        this.questionId = answerBuilder.questionId;
        this.isCorrect = answerBuilder.isCorrect;
    }

    public Long getId() {
        return id;
    }

    public String getOptionAnswer() {
        return optionAnswer;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public static AnswerBuilder builder() {
        return new AnswerBuilder();
    }

    public static class AnswerBuilder {
        private Long id;
        private String optionAnswer;
        private Long questionId;
        private boolean isCorrect;

        public AnswerBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public AnswerBuilder optionAnswer(String optionAnswer) {
            this.optionAnswer = optionAnswer;
            return this;
        }

        public AnswerBuilder questionId(Long questionId) {
            this.questionId = questionId;
            return this;
        }

        public AnswerBuilder correct(boolean correct) {
            isCorrect = correct;
            return this;
        }

        public Answer build() {
            return new Answer(this);
        }
    }
}
