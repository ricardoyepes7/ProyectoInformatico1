package com.innovasoft.PO2Academy.domain.model;


public class User {
    private final String username;
    private final String password;
    private final String name;
    private final String lastName;
    private Integer level;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.level = builder.level;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }


    public Integer getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String username;
        private String password;
        private String name;
        private String lastName;
        private Integer level;

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder level(Integer level) {
            this.level = level;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
