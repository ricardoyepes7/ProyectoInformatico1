package com.innovasoft.PO2Academy.domain.model;

public class Tutorial {
    private Long id;
    private Long challengeId;
    private String url;

    public Tutorial(Long id, Long challengeId, String url) {
        this.id = id;
        this.challengeId = challengeId;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Long challengeId) {
        this.challengeId = challengeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
