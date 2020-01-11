package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    private static final Candidate CANDIDATE_3 = new Candidate(3, FIZZ);
    public static final Candidate CANDIDATE_5 = new Candidate(5, BUZZ);
    public static final Candidate CANDIDATE_7 = new Candidate(7, WHIZZ);
    private Modulo modulo3 = new Modulo(CANDIDATE_3);
    private Modulo modulo5 = new Modulo(CANDIDATE_5);
    private Modulo modulo7 = new Modulo(CANDIDATE_7);

    public String fizzBuzz(int number) {
        if (contains5(number)) {
            ModuloRule rule6 = new ModuloRule(modulo5, modulo7);
            if (rule6.match(number)) {
                return rule6.apply(number);
            }
        }
        ContainsRule rule4And5 = new ContainsRule(CANDIDATE_3);
        if (rule4And5.match(number)) {
            return rule4And5.apply(number);
        }
        ModuloRule rule2And3 = new ModuloRule(modulo3, modulo5, modulo7);
        if (rule2And3.match(number)) {
            return rule2And3.apply(number);
        }
        return String.valueOf(number);
    }

    private boolean contains5(int number) {
        return String.valueOf(number).contains("5");
    }

}
