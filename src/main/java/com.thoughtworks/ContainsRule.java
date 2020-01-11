package com.thoughtworks;

public class ContainsRule {
    private String keyword;

    public ContainsRule(String keyword) {
        this.keyword = keyword;
    }

    public boolean match(int number) {
        return String.valueOf(number).contains(keyword);
    }
}
