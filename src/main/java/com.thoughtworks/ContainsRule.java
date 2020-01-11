package com.thoughtworks;

public class ContainsRule implements Rule {

    private Rule rule;
    private Candidate candidate;

    public ContainsRule(Candidate candidate, Rule moduloRule) {
        this.candidate = candidate;
        this.rule = moduloRule;
    }

    @Override
    public boolean match(int number) {
        return String.valueOf(number).contains(String.valueOf(candidate.getNumber()));
    }

    @Override
    public String apply(int number) {
        if (rule.match(number)) {
            return rule.apply(number);
        }
        return this.candidate.getDescription();
    }
}
