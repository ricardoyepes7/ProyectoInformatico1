package com.innovasoft.PO2Academy.domain.model;


public class User {
    private String username;
    private String password;
    private String name;
    private String lastName;
    private Integer level;

    public User(String username, String password, String name, String lastName, Integer level) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
