package com.thoughtworks;

public class ContainsRule {

    private Candidate candidate;

    public ContainsRule(Candidate candidate) {
        this.candidate = candidate;
    }

    public boolean match(int number) {
        return String.valueOf(number).contains(String.valueOf(candidate.getNumber()));
    }
}
