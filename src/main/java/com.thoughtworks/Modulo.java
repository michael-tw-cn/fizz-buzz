package com.thoughtworks;

public class Modulo {
    private int value;
    private String description;

    public Modulo(int value, String description) {
        this.value = value;
        this.description = description;
    }


    public boolean canModuloBy(int number) {
        return number % this.value == 0;
    }

    public String getDescription() {
        return description;
    }

}
