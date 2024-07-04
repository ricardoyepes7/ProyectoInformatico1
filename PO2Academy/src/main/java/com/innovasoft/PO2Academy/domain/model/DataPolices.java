package com.innovasoft.PO2Academy.domain.model;

import java.time.LocalDateTime;

public class DataPolices {
    private final String username;
    private final LocalDateTime date;

    public DataPolices(String username, LocalDateTime date) {
        this.username = username;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "DataPolices{" +
                "username='" + username + '\'' +
                ", date=" + date +
                '}';
    }
}
