package com.thoughtworks;

public class DefaultRule implements Rule {
    @Override
    public boolean match(int number) {
        return false;
    }

    @Override
    public String apply(int number) {
        return String.valueOf(number);
    }
}
