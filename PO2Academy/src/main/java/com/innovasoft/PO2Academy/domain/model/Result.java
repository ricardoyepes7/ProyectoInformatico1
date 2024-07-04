package com.innovasoft.PO2Academy.domain.model;

import java.time.LocalDateTime;

public class Result {
    private final Long id;
    private final String username;
    private final Long challengeId;
    private final Integer score;
    private final LocalDateTime date;
    private final Integer level;

    private Result(ResultBuilder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.challengeId = builder.challengeId;
        this.score = builder.score;
        this.date = builder.date;
        this.level = builder.level;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public Integer getScore() {
        return score;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Integer getLevel() {
        return level;
    }

    public static ResultBuilder builder() {
        return new ResultBuilder();
    }

    public static class ResultBuilder {
        private Long id;
        private String username;
        private Long challengeId;
        private Integer score;
        private LocalDateTime date;
        private Integer level;

        public ResultBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ResultBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ResultBuilder challengeId(Long challengeId) {
            this.challengeId = challengeId;
            return this;
        }

        public ResultBuilder score(Integer score) {
            this.score = score;
            return this;
        }

        public ResultBuilder date(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public ResultBuilder level(Integer level) {
            this.level = level;
            return this;
        }

        public Result build() {
            return new Result(this);
        }
    }

}
