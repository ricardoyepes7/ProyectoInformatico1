package com.innovasoft.PO2Academy.domain.model;

import java.time.LocalDateTime;

public class Result {
    private Long id;
    private String username;
    private Long challengeId;
    private Integer score;
    private LocalDateTime date;
    private Integer level;

    public Result(Long id, String username, Long challengeId, Integer score, LocalDateTime date, Integer level) {
        this.id = id;
        this.username = username;
        this.challengeId = challengeId;
        this.score = score;
        this.date = date;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Long challengeId) {
        this.challengeId = challengeId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
