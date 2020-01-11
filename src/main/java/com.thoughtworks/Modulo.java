package com.thoughtworks;

public class Modulo {
    private Candidate candidate;

    public Modulo(Candidate candidate) {
        this.candidate = candidate;
    }


    public boolean canModuloBy(int number) {
        return number % this.candidate.getNumber() == 0;
    }

    public String getDescription() {
        return this.candidate.getDescription();
    }

}
