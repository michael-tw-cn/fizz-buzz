package com.thoughtworks;

public interface Rule {
    boolean match(int number);

    String apply(int number);
}
