package com.thoughtworks;

public class ContainsRule implements Rule {

    private Candidate candidate;

    public ContainsRule(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public boolean match(int number) {
        return String.valueOf(number).contains(String.valueOf(candidate.getNumber()));
    }

    @Override
    public String apply(int number) {
        return this.candidate.getDescription();
    }
}
