package com.thoughtworks;

public class Candidate {
    private int number;
    private String description;

    public Candidate(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
