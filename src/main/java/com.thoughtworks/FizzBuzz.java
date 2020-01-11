package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FizzBuzz {

    private static final Candidate CANDIDATE_3 = new Candidate(3, "Fizz");
    private static final Candidate CANDIDATE_5 = new Candidate(5, "Buzz");
    private static final Candidate CANDIDATE_7 = new Candidate(7, "Whizz");
    private final List<Rule> rules = new ArrayList<>();

    public FizzBuzz() {
        Modulo modulo3 = new Modulo(CANDIDATE_3);
        Modulo modulo5 = new Modulo(CANDIDATE_5);
        Modulo modulo7 = new Modulo(CANDIDATE_7);
        rules.add(new ContainsRule(CANDIDATE_7, new ModuloRule(modulo3, modulo7)));
        rules.add(new ContainsRule(CANDIDATE_5, new ModuloRule(modulo5, modulo7)));
        rules.add(new ContainsRule(CANDIDATE_3, new DefaultRule()));
        rules.add(new ModuloRule(modulo3, modulo5, modulo7));
    }

    String fizzBuzz(int number) {
        return this.rules.stream().filter(rule -> rule.match(number)).findFirst().orElse(new DefaultRule()).apply(number);
    }

}
