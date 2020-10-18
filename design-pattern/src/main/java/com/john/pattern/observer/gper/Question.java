package com.john.pattern.observer.gper;

public class Question {

    private String username;

    private String content;

    public Question(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public Question() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "username='" + username + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
