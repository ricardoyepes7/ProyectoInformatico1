package com.innovasoft.PO2Academy.domain.model;

public class Tutorial {
    private final Long id;
    private final Long challengeId;
    private final String url;

    public Tutorial(Long id, Long challengeId, String url) {
        this.id = id;
        this.challengeId = challengeId;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public String getUrl() {
        return url;
    }
}
